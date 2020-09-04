package com.example.dubbo.demo.consumer.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.rpc.RpcContext;
import com.example.dubbo.demo.api.UserService;
import com.example.dubbo.demo.api.request.UserRequest;
import com.example.dubbo.demo.api.response.UserResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.Future;

/**
 * @Author: weijianwei
 * @Date: 2019-05-16 14:47
 * @Description:
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Reference(version = "1.0.0", check = false, async = true, timeout = 15000)
    private UserService userService;

    @RequestMapping("/query")
    @ResponseBody
    public String query() throws Exception {
        UserRequest request = new UserRequest();
        request.setUserId(1L);
        UserResponse userResponse = userService.getOne(request);
        Future<UserResponse> temp= RpcContext.getContext().getFuture();
        userResponse = temp.get();
        return userResponse.getUserName();
    }
}
