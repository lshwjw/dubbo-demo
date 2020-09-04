package com.example.dubbo.demo.consumer.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.dubbo.demo.api.RoleService;
import com.example.dubbo.demo.api.request.RoleRequest;
import com.example.dubbo.demo.api.response.RoleResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: weijianwei
 * @Date: 2020/9/2 20:18
 * @Description:
 */
@Controller
@RequestMapping("/role")
public class RoleController {

    @Reference(version = "1.0.0", check = false, async = false, timeout = 15000)
    private RoleService roleService;

    @RequestMapping("/query")
    @ResponseBody
    public String query() {
        RoleRequest request = new RoleRequest();
        request.setRoleId(1L);
        RoleResponse roleResponse = roleService.getOne(request);
        return roleResponse.getRoleName();
    }
}
