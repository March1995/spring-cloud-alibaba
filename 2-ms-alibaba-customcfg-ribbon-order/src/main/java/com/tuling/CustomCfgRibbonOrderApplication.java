package com.tuling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 基于ribbon细粒度的负载均衡
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CustomCfgRibbonOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomCfgRibbonOrderApplication.class, args);
    }

}
