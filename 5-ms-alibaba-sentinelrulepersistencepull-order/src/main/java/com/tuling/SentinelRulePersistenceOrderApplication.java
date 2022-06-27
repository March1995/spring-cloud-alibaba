package com.tuling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SentinelRulePersistenceOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SentinelRulePersistenceOrderApplication.class, args);
	}

}
