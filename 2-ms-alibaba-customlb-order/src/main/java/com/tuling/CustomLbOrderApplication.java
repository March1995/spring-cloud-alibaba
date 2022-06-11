package com.tuling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 自己手写的负载均衡
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CustomLbOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomLbOrderApplication.class, args);
    }

}
