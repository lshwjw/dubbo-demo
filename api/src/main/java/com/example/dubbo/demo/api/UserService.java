package com.example.dubbo.demo.api;

import com.example.dubbo.demo.api.request.UserRequest;
import com.example.dubbo.demo.api.response.UserResponse;

/**
 * @Author: weijianwei
 * @Date: 2019-05-13 10:10
 * @Description:
 */
public interface UserService {

    UserResponse getOne(UserRequest request);
}
