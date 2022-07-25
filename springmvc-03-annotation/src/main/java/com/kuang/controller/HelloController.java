package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xxx
 * @version 1.0
 * @Description
 * @date 2022/7/25 12:25
 */
@Controller
public class HelloController {

   /* @RequestMapping("/hello")//使用此注解完成对URL的接收
    public String hello(Model model){
        //封装数据
        model.addAttribute("msg","Hello,SpringMVCAnnotation!");

        return "hello";//会被视图解析器处理
    }*/
   //真实访问地址 : 项目名/HelloController/hello
   @RequestMapping("/hello")
   public String sayHello(Model model){
       //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
       model.addAttribute("msg","hello,SpringMVC");
       //web-inf/jsp/hello.jsp
       return "hello";
   }
}
