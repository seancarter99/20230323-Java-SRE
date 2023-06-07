package com.skillstorm.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsSpringAccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsSpringAccountsApplication.class, args);
	}

}
