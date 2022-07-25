package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xxx
 * @version 1.0
 * @Description
 * @date 2022/7/25 14:18
 */

@Controller
//实际开发中，不建议这样写，如果要分层，建议直接在方法名上面的RequestMapping后面加映射名。
@RequestMapping("c1")
public class ControllerTest3 {
    @RequestMapping("t1")
    public String test1(Model model){
        model.addAttribute("msg","c1t1Controller!");
        return "test";
    }
}
