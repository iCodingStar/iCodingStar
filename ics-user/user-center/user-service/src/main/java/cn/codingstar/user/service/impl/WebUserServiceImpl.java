package cn.codingstar.user.service.impl;

import cn.codingstar.common.bean.ExceptionType;
import cn.codingstar.common.exception.BusinessException;
import cn.codingstar.common.utils.CollectionUtils;
import cn.codingstar.common.utils.ObjectUtils;
import cn.codingstar.common.utils.StringUtils;
import cn.codingstar.common.utils.ValidateUtils;
import cn.codingstar.model.persistent.WebUser;
import cn.codingstar.model.persistent.WebUserExample;
import cn.codingstar.user.common.UserResult;
import cn.codingstar.user.mapper.WebUserMapper;
import cn.codingstar.user.service.WebUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * Description: WebUserServiceImpl
 *
 * @author iCodingStar
 * @version 1.0
 *          Filename:    WebUserServiceImpl.java
 *          Create at:   2017/3/2
 *          <p>
 *          Copyright:   Copyright (c)2016
 *          <p>
 *          Modification History:
 *          Date                  Author         Version    Description
 *          ------------------------------------------------------------------
 *          2017/3/2           iCodingStar       1.0       1.0 Version
 */
@Service("webUserService")
public class WebUserServiceImpl implements WebUserService {

    @Autowired
    private WebUserMapper webUserMapper;


    @Override
    public WebUser register(WebUser webUser) {
        /*参数校验*/
        ValidateUtils.required(webUser.getUsername());
        ValidateUtils.required(webUser.getPassword());
        ValidateUtils.text(webUser.getUsername());
        ValidateUtils.text(webUser.getPassword());
        if (!checkUsername(webUser.getUsername())){
            throw new BusinessException(ExceptionType.USER_EXIST_ALREADY);
        }
        /*设置基本注册信息*/
        WebUser originWebUser = new WebUser();
        originWebUser.setUsername(webUser.getUsername());
        originWebUser.setPassword(webUser.getPassword());
        if (StringUtils.isEmpty(webUser.getPasswordSalt())) {
            webUser.setPasswordSalt(webUser.getUsername());
        }
        if (StringUtils.isEmpty(webUser.getNickname())) {
            webUser.setNickname(webUser.getUsername());
        }
        webUser.encodePassword();
        webUser.setEnable(true);
        webUserMapper.insertSelective(webUser);
        // 返回已经注册的用户
        WebUser registeredUser = new WebUser();
        registeredUser.setUsername(originWebUser.getPassword());
        registeredUser.setEnable(true);
        return registeredUser;
    }

    @Override
    public WebUser login(WebUser loginUser) {
        String username = loginUser.getUsername();
        String password = loginUser.getPassword();
        /*参数校验*/
        ValidateUtils.required(username);
        ValidateUtils.required(password);
        ValidateUtils.text(username);
        ValidateUtils.text(password);

        WebUser webUser = getUserByUserName(username);
        if (ObjectUtils.isEmpty(webUser)) {
            throw new BusinessException(ExceptionType.USER_NOT_FOUND);
        }
        if (!webUser.checkPassword(password)) {
            throw new BusinessException(ExceptionType.USERNAME_PASSWORD_ERROR);
        }
        webUser.generateToken();
        webUserMapper.updateByPrimaryKeySelective(webUser);
        loginUser.setToken(webUser.getToken());
        return loginUser;
    }

    /**
     * 检查用户名是否已经存在，如果已经存在返回false
     *
     * @param username
     * @return
     */
    private boolean checkUsername(String username) {
        WebUserExample example = new WebUserExample();
        WebUserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<WebUser> userList = null;
        userList = webUserMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(userList)) {
            return false;
        }else {
            return true;
        }
    }

    /**
     * 查询用户信息
     *
     * @param username
     * @return
     */
    private WebUser getUserByUserName(String username) {
        WebUserExample example = new WebUserExample();
        WebUserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<WebUser> userList = null;
        userList = webUserMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(userList)) {
            return null;
        }
        return userList.get(0);
    }
}
