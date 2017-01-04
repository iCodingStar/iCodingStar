package cn.codingstar.blog.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Description: HomePageController
 *
 * @author iCodingStar
 * @version 1.0
 *          Filename:    HomePageController.java
 *          Create at:   2016/12/29
 *          <p>
 *          Copyright:   Copyright (c)2016
 *          Company:     songxiaocai
 *          <p>
 *          Modification History:
 *          Date                  Author         Version    Description
 *          ------------------------------------------------------------------
 *          2016/12/29           iCodingStar       1.0       1.0 Version
 */
@RequestMapping("/homePage/*")
@Controller
public class HomePageController {

    @RequestMapping("/index")
    public ModelAndView getHomePage(){
        ModelAndView mav = new ModelAndView("homePage/index");
        // 1. 获取文章列表
        // 2. 获取标签列表
        // 3. 获取排行榜信息

        mav.addObject("user","iCodingStar");
        return mav;
    }

}
