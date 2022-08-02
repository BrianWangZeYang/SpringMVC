package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author xxx
 * @version 1.0
 * @Description
 * @date 2022/8/1 22:54
 */
@Controller
@RequestMapping("/user")
public class InterceptorController {
    @RequestMapping("/t1")
    public String test1(){
        System.out.println("控制器中的方法执行了");
        return "interceptorController执行了";
    }
    @RequestMapping("/login")
    public String login(String name, String pwd, HttpSession session){
        // 向session记录用户身份信息
        System.out.println("接收前端==="+name);
        session.setAttribute("user", name);
        return "main";
    }

    @RequestMapping("/toLogin")
    public String tologin(){
        return "login";
    }

    @RequestMapping("/toMain")
    public String tomain(){
        return "main";
    }
}
