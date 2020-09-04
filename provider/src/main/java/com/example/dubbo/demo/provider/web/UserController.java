package com.example.dubbo.demo.provider.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: weijianwei
 * @Date: 2019-05-16 13:58
 * @Description:
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/query")
    @ResponseBody
    public String query() {
        return "张三";
    }
}
