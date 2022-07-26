package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author xxx
 * @version 1.0
 * @Description
 * @date 2022/7/26 11:48
 */
@Controller
public class ModelTest1 {

    @RequestMapping("/m1/t1")
    public String test(Model model){
        //转发
       /* model.addAttribute("msg","ModelTest1");
        return "/WEB-INF/jsp/test.jsp";*/
        //转发（通过forward前缀来表明是转发,与上面的转发没有区别，只是多了一个前缀）
       /* model.addAttribute("msg","ModelTest1");
        return "forward:/WEB-INF/jsp/test.jsp";*/
        //重定向
        model.addAttribute("msg","ModelTest1");
        return "redirect:/index.jsp";

    }
}
