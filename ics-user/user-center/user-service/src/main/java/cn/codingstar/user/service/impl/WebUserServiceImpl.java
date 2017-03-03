package cn.codingstar.user.service.impl;

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
        ValidateUtils.required(webUser.getUsername());
        ValidateUtils.required(webUser.getPassword());
        ValidateUtils.text(webUser.getUsername());
        ValidateUtils.text(webUser.getPassword());
        ValidateUtils.check(checkUsername(webUser.getUsername()));
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

    /**
     * 检查用户名是否已经存在，如果已经存在返回false
     *
     * @param username
     * @return
     */
    private boolean checkUsername(String username) {
        WebUserExample example = new WebUserExample();
        WebUserExample.Criteria criteria = example.createCriteria();
        if (username != null) {
            criteria.andUsernameEqualTo(username);
        } else {
            return false;
        }
        return ObjectUtils.isEmpty(webUserMapper.selectByExample(example));
    }
}
