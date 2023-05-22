package com.skillstorm.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class SpringProfilesPracticeApplication implements CommandLineRunner {

	@Value("Sean")
	private String name; // private String name = "Sean";
	
	@Value("${my.env.mode}") // This reads from that environment object
	private String mode;
	
	@Value("${some.other.value}")
	private String val;
	
	@Autowired
	private Environment env; // Contains all the values from the .env file and Spring itself
	
	public static void main(String[] args) {
		SpringApplication.run(SpringProfilesPracticeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(mode);
		System.out.println(val);
	}

}
