package cn.codingstar.blog.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Description: ArticleController
 *
 * @author iCodingStar
 * @version 1.0
 *          Filename:    ArticleController.java
 *          Create at:   2016/12/30
 *          <p>
 *          Copyright:   Copyright (c)2016
 *          Company:     songxiaocai
 *          <p>
 *          Modification History:
 *          Date                  Author         Version    Description
 *          ------------------------------------------------------------------
 *          2016/12/30           iCodingStar       1.0       1.0 Version
 */
@RequestMapping(value = "{userName}/article/*")
@Controller
public class ArticleController {

    @RequestMapping(value = {"/write"},method = {RequestMethod.GET})
    public ModelAndView writeArticlePage(@PathVariable("userName") String userName) {
        ModelAndView mav = new ModelAndView("article/write");
        // 进入文章书写页面
        return mav;
    }

    @RequestMapping(value = {"/list/{currentPage}"},method = {RequestMethod.GET})
    public ModelAndView getArticleList(@PathVariable("currentPage")Integer currentPage){
        ModelAndView mav = new ModelAndView("article/list");
        // 查询文章列表
        return mav;
    }

}
