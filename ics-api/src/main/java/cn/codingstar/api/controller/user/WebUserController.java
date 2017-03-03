package cn.codingstar.api.controller.user;

import cn.codingstar.common.result.ApiResult;
import cn.codingstar.model.persistent.WebUser;
import cn.codingstar.user.client.WebUserClient;
import cn.codingstar.user.common.UserResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RequestWrapper;

/**
 * Description: WebUserController
 *
 * @author iCodingStar
 * @version 1.0
 *          Filename:    WebUserController.java
 *          Create at:   2017/3/2
 *          <p>
 *          Copyright:   Copyright (c)2016
 *          <p>
 *          Modification History:
 *          Date                  Author         Version    Description
 *          ------------------------------------------------------------------
 *          2017/3/2           iCodingStar       1.0       1.0 Version
 */
@Controller
@RequestMapping("/webUser")
public class WebUserController {

    @Autowired
    private WebUserClient webUserClient;

    @RequestMapping(value = {"/register"}, method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public ApiResult<WebUser> register(WebUser registerUser) {
        ApiResult<WebUser> apiResult = new ApiResult<>();
        UserResult<WebUser> result = webUserClient.register(registerUser);
        apiResult.setCode(result.getCode());
        apiResult.setMessage(result.getMessage());
        apiResult.setData(result.getData());
        return apiResult;
    }

    @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
    @ResponseBody
    public ApiResult<WebUser> login(WebUser loginUser) {
        ApiResult<WebUser> apiResult = new ApiResult<>();
        UserResult<WebUser> result = webUserClient.login(loginUser);
        apiResult.setCode(result.getCode());
        apiResult.setMessage(result.getMessage());
        apiResult.setData(result.getData());
        return apiResult;
    }
}