package com.skillstorm.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MsSpringEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsSpringEurekaServerApplication.class, args);
	}

}
