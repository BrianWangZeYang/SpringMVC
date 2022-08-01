package com.kuang.controller;

import com.kuang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xxx
 * @version 1.0
 * @Description
 * @date 2022/7/31 21:58
 */
@RestController
public class AjaxController {
    @RequestMapping("/t1")
    public String test(){
        return "hello";
    }

    @RequestMapping("/a1")
    public void ajax1(String name , HttpServletResponse response) throws IOException {
        if ("admin".equals(name)){
            response.getWriter().print("true");
        }else{
            response.getWriter().print("false");
        }
    }
    @RequestMapping("/a2")
    public List<User> a2(){
        List<User> list = new ArrayList<User>();
        list.add(new User("秦疆1号",3,"男"));
        list.add(new User("秦疆2号",3,"男"));
        list.add(new User("秦疆3号",3,"男"));
        return list; //由于@RestController注解，将list转成json格式返回
    }
    @RequestMapping("/a3")
    public String a3(String name,String pwd){
        String data="";
        if (name!=null){
            if ("admin".equals(name)){
                data="OK";
            }else{
                data="输入的用户名有误";
            }
        }
        if (pwd!=null){
            if ("333".equals(pwd)){
                data="OK";
            }else{
                data="输入的密码有误";
            }
        }
        return data;
    }
}
