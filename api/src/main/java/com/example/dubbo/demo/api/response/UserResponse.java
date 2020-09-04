package com.example.dubbo.demo.api.response;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: weijianwei
 * @Date: 2019-05-13 10:12
 * @Description:
 */
@Data
@Builder
public class UserResponse implements Serializable {

    private String userName;
}
