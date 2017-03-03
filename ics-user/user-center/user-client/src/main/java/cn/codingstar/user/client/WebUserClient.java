package cn.codingstar.user.client;

import cn.codingstar.common.constant.ResultType;
import cn.codingstar.common.exception.BusinessException;
import cn.codingstar.model.persistent.WebUser;
import cn.codingstar.user.common.UserResult;
import cn.codingstar.user.service.WebUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.transform.Result;

/**
 * Description: WebUserClient
 *
 * @author iCodingStar
 * @version 1.0
 *          Filename:    WebUserClient.java
 *          Create at:   2017/3/2
 *          <p>
 *          Copyright:   Copyright (c)2016
 *          <p>
 *          Modification History:
 *          Date                  Author         Version    Description
 *          ------------------------------------------------------------------
 *          2017/3/2           iCodingStar       1.0       1.0 Version
 */
@Service("webUserClient")
public class WebUserClient {

    private static Logger logger = LoggerFactory.getLogger(WebUserClient.class);

    @Autowired
    private WebUserService webUserService;

    public UserResult<WebUser> register(WebUser registerUser) {
        UserResult<WebUser> result = new UserResult<>();
        WebUser user = null;
        try {
            user = webUserService.register(registerUser);
        } catch (BusinessException b) {
            logger.error("注册失败！", b);
            result.setCode(b.getCode());
            result.setMessage(b.getMessage());
            return result;
        }
        result.setCode(ResultType.SUCCESS.getCode());
        result.setMessage(ResultType.SUCCESS.getMessage());
        result.setData(user);
        return result;
    }

    public UserResult<WebUser> login(WebUser loginUser){
        UserResult<WebUser> result = new UserResult<>();
        WebUser user = null;
        try {
            user = webUserService.login(loginUser);
        } catch (BusinessException b) {
            logger.error("登陆失败！", b);
            result.setCode(b.getCode());
            result.setMessage(b.getMessage());
            result.setData(user);
            return result;
        }
        result.setCode(ResultType.SUCCESS.getCode());
        result.setMessage(ResultType.SUCCESS.getMessage());
        result.setData(user);
        return result;
    }
}
