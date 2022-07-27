package com.kuang.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;

/**
 * @author xxx
 * @version 1.0
 * @Description
 * @date 2022/7/27 16:48
 */
public class JsonUtils {
    //重载，这是新手的写法
   /* public static String getJson(Object object){
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }*/
    //重载，源码思想，老手写法,代码重复使用，不反复造轮子。
    public static String getJson(Object object){
       return getJson(object,"yyyy-MM-dd HH:mm:ss");
    }

    public static String getJson(Object object ,String dateFormat){
        ObjectMapper mapper = new ObjectMapper();
        //使用ObjectMapper 来格式化输出(默认是将时间转化为时间戳格式，选择关闭就加false)。第一步，添加state为false，表示不使用时间戳的方式
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);
        //自定义日期的格式
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        mapper.setDateFormat(sdf);

        try {
            return mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
