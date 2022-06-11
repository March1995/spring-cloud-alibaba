package com.tuling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 针对日志com.tuling.feignapi 包下的日志级 别必须调整为DEBUG级别的 不然是不会打印日志的
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CustomCfgFeignOrder {

    public static void main(String[] args) {
        SpringApplication.run(CustomCfgFeignOrder.class, args);
    }
}
