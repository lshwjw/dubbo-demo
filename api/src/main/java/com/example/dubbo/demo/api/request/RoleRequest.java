package com.example.dubbo.demo.api.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: weijianwei
 * @Date: 2020/9/2 20:14
 * @Description:
 */
@Data
public class RoleRequest implements Serializable {

    private Long roleId;
}
