package com.example.dubbo.demo.api;

import com.example.dubbo.demo.api.request.RoleRequest;
import com.example.dubbo.demo.api.response.RoleResponse;

/**
 * @Author: weijianwei
 * @Date: 2020/9/2 20:13
 * @Description:
 */
public interface RoleService {

    RoleResponse getOne(RoleRequest request);
}
