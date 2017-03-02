package cn.codingstar.api.controller.user;

import cn.codingstar.common.result.ApiResult;
import cn.codingstar.model.persistent.WebUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    @RequestMapping(value = {"/register"}, method = {RequestMethod.GET, RequestMethod.POST})
    public ApiResult<WebUser> register() {
        ApiResult<WebUser> apiResult = new ApiResult<>();
        WebUser webUser = new WebUser();
        webUser.setId(1000);
        webUser.setNickname("iCodingStar");
        apiResult.setCode(200);
        apiResult.setMessage("注册成功！");
        apiResult.setData(webUser);
        return apiResult;
    }

    @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
    public ApiResult<WebUser> login() {
        ApiResult<WebUser> apiResult = new ApiResult<>();
        WebUser webUser = new WebUser();
        webUser.setId(1000);
        webUser.setNickname("iCodingStar");
        apiResult.setCode(200);
        apiResult.setMessage("登陆成功！");
        apiResult.setData(webUser);
        return apiResult;
    }
}