package cn.codingstar.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Description: UserController
 *
 * @author iCodingStar
 * @version 1.0
 *          Filename:    UserController.java
 *          Create at:   2017/3/1
 *          <p>
 *          Copyright:   Copyright (c)2016
 *          <p>
 *          Modification History:
 *          Date                  Author         Version    Description
 *          ------------------------------------------------------------------
 *          2017/3/1           iCodingStar       1.0       1.0 Version
 */
@Controller
@RequestMapping("/user")
public class UserController {


    @RequestMapping("/login/{userName}/{password}")
    @ResponseBody
    public String login(String userName,
                        String password){

        return "";
    }

    public String register(String userName,
                           String password,
                           String confirmPassword){
        return "";
    }
}
