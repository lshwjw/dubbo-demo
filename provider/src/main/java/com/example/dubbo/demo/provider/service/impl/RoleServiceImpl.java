package com.example.dubbo.demo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubbo.demo.api.RoleService;
import com.example.dubbo.demo.api.request.RoleRequest;
import com.example.dubbo.demo.api.response.RoleResponse;

/**
 * @Author: weijianwei
 * @Date: 2020/9/2 20:16
 * @Description:
 */
@Service(version = "1.0.0", cluster = "Failover")
public class RoleServiceImpl implements RoleService {

    @Override
    public RoleResponse getOne(RoleRequest request) {
        return RoleResponse.builder().roleName("test").build();
    }
}
