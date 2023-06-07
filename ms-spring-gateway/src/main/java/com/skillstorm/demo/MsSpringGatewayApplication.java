package com.skillstorm.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // Could do this manually
public class MsSpringGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsSpringGatewayApplication.class, args);
	}

}
