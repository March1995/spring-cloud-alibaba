package com.tuling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Tulingvip02MsAlibabaCustomLbOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tulingvip02MsAlibabaCustomLbOrderApplication.class, args);
	}

}
