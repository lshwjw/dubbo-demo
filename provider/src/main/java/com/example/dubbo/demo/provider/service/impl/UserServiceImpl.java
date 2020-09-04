package com.example.dubbo.demo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubbo.demo.api.UserService;
import com.example.dubbo.demo.api.request.UserRequest;
import com.example.dubbo.demo.api.response.UserResponse;

/**
 * @Author: weijianwei
 * @Date: 2019-05-13 10:29
 * @Description:
 */
@Service(version = "1.0.0", cluster = "Failover")
public class UserServiceImpl implements UserService {

    @Override
    public UserResponse getOne(UserRequest request) {
        return UserResponse.builder().userName("test").build();
    }
}
