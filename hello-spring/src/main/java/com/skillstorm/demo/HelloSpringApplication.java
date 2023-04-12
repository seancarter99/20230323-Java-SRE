package com.skillstorm.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.skillstorm.demo.beans.Drink;
import com.skillstorm.demo.beans.Person;

@SpringBootApplication
public class HelloSpringApplication implements CommandLineRunner {

	// Give this to me Spring
	@Autowired
	@Qualifier("anotherDrink") // Choose the bean by bean name
	private Drink drink;
	
	@Autowired
	private Drink anotherDrink;
	
	public static void main(String[] args) {
		
		// Starts the Application Context (IoC Container)
		// Bootstraps my app, initializes beans, etc.
		ApplicationContext ctx = SpringApplication.run(HelloSpringApplication.class, args);
//		Drink drink = (Drink) ctx.getBean("anotherDrink");
//		Drink drink = ctx.getBean(Drink.class);
//		drink.sip();
		
//		Person person = ctx.getBean(Person.class);
//		person.act();
	}

	@Override
	public void run(String... args) throws Exception {
//		drink.sip(); // Spring IoC container started up. I can use the beans
//		System.out.println(anotherDrink);
	}

}
