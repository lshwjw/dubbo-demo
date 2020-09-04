package com.example.dubbo.demo.api.response;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: weijianwei
 * @Date: 2020/9/2 20:14
 * @Description:
 */
@Data
@Builder
public class RoleResponse implements Serializable {

    private String roleName;
}
