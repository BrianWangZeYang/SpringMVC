package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sun.awt.SunHints;

/**
 * @author xxx
 * @version 1.0
 * @Description
 * @date 2022/7/25 22:29
 */
@Controller
public class RestFulController {
    //以前的 http://localhost:8080/springmvc_04_controller_war_exploded/add?a=1&b=2
    //RestFul:http://localhost:8080/springmvc_04_controller_war_exploded/add/a/b
    //@RequestMapping(name = "/add/{a}/{b}",method= RequestMethod.GET)
   /* @PostMapping("add/{a}/{b}")
    public String test1(@PathVariable int a, @PathVariable String b, Model model){
        String res = a + b;
        model.addAttribute("msg","a+b结果1为"+res);
        return "test";
    }*/
    @GetMapping("add/{a}/{b}")
    public String test2(@PathVariable int a, @PathVariable String b, Model model){
        String res = a + b;
        model.addAttribute("msg","a+b结果2为"+res);
        return "test";
    }
    //通过test3，这个方法可以看的出来，其效果作用等价于test1相同,test1的那种方式为简化的注解
    @RequestMapping(value = "add/{a}/{b}",method = RequestMethod.POST)
    public String test3(@PathVariable int a, @PathVariable String b, Model model){
        String res = a + b;
        model.addAttribute("msg","a+b结果3为"+res);
        return "test";
    }
}
