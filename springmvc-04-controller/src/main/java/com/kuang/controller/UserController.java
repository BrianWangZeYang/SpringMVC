package com.kuang.controller;

import com.kuang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author xxx
 * @version 1.0
 * @Description
 * @date 2022/7/26 13:15
 */
@Controller
@RequestMapping("/user")
public class UserController {

    //localhost:8080/user/t1 ? name = xxx;
    @GetMapping("/t1")
    //一个参数若是从前端接收，就加上@RequestParam，无论其括号内的名字与属性名是否一样，若不是前端传递过来的参数就不加。
    public String test1(@RequestParam("username") String name, Model model){
        //1、接收前端参数
        System.out.println("接收到前端的参数为："+name);
        //2、将返回的结果传递给前端
        model.addAttribute("msg",name);
        //3、跳转视图
        return "test";
    }
    //前端接收一个对象:id,name,age。可以直接将User拿过来，而不需要每个参数都写进去，因为一般都是接受的对象
    /*
    1、接收前端用户传递的参数，判断参数的名字，假设名字直接在方法上，可以直接使用。
    2、假设传递的是一个对象User,匹配User对象中的字段名，如果名字一致则OK，否则，匹配不到.
    * */
    @GetMapping("/t2")
    public String test2(User user){
        System.out.println(user);
        return "test";
    }
    @GetMapping("/t3")
    public String  test(){
        return "test";
    }
}
