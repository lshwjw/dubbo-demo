package com.example.dubbo.demo.api.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: weijianwei
 * @Date: 2019-05-13 10:11
 * @Description:
 */
@Data
public class UserRequest implements Serializable {

    private Long userId;
}
