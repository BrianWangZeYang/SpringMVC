package com.kuang.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.kuang.pojo.User;
import com.kuang.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author xxx
 * @version 1.0
 * @Description
 * @date 2022/7/27 15:36
 */
@Controller
public class UserController {
    @RequestMapping("/j1")
    @ResponseBody //添加了@ResponseBody注解就不会走视图解析器，会直接返回一个字符串。另有一种方法，就是在不使用@ResponseBody的时候将@Controller修改为@RestController即可达到同样的效果。
    public String json1() throws JsonProcessingException {
        //jackson, ObjectMapper
        ObjectMapper mapper = new ObjectMapper();

        //创建一个对象
        User user = new User("秦将1号", 3, "男");

        String str = mapper.writeValueAsString(user);
        return str;
    }
    @RequestMapping("/j2")
    @ResponseBody
    public String json2() throws JsonProcessingException {
        //使用工具类之前
       /* ObjectMapper mapper = new ObjectMapper();

        User user1 = new User("秦将1号", 3, "男");
        User user2 = new User("秦将1号", 3, "男");
        User user3 = new User("秦将1号", 3, "男");
        User user4 = new User("秦将1号", 3, "男");

        List<User> userList = new ArrayList<User>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);

        String str = mapper.writeValueAsString(userList);
        return str;*/
        User user1 = new User("秦将1号", 3, "男");
        User user2 = new User("秦将2号", 3, "男");
        User user3 = new User("秦将3号", 3, "男");
        User user4 = new User("秦将4号",9, "男");

        List<User> userList = new ArrayList<User>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        //复用工具类中的双参数getJson方法
            //return JsonUtils.getJson(userList, "yyyy-MM-dd HH:mm:ss");
        //调用工具类中单参数的方法
            return JsonUtils.getJson(userList);
    }

    @RequestMapping("/j3")
    @ResponseBody
    public String json3() throws JsonProcessingException {
        //使用工具类之前
       /* ObjectMapper mapper = new ObjectMapper();

        //使用ObjectMapper 来格式化输出(默认是将时间转化为时间戳格式，选择关闭就加false)。第一步，添加state为false，表示不使用时间戳的方式
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);
        //自定义日期的格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        mapper.setDateFormat(sdf);
        Date date = new Date();


        //Jackson 默认是会把时间转成timestamps形式,时间戳形式
        String str = mapper.writeValueAsString(date);

        return str;*/
       //使用工具类之后
        return JsonUtils.getJson(new Date(), "yyyy-MM-dd HH:mm:ss");
    }

    @RequestMapping("/j4")
    @ResponseBody
    public String json4() throws JsonProcessingException {
        User user1 = new User("秦将1号", 3, "男");
        User user2 = new User("秦将2号", 3, "男");
        User user3 = new User("秦将3号", 3, "男");
        User user4 = new User("秦将4号",9, "男");

        List<User> userList = new ArrayList<User>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        //"******Java对象 转 JSON字符串******"
        return JSON.toJSONString(userList);
    }
}
