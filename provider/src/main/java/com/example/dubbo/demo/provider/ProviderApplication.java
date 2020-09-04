package com.example.dubbo.demo.provider;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: weijianwei
 * @Date: 2019-05-13 10:40
 * @Description:
 */
@SpringBootApplication
@EnableDubbo
@EnableDubboConfiguration
@DubboComponentScan("com.example.dubbo.demo.provider.service.impl")
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
