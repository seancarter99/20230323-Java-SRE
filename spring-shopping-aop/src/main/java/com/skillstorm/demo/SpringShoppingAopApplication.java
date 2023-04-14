package com.skillstorm.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.skillstorm.demo.beans.Costco;
import com.skillstorm.demo.beans.Item;

@SpringBootApplication
//@EnableAspectJAutoProxy // ComponentScan for @Aspect classes
public class SpringShoppingAopApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringShoppingAopApplication.class, args);
		
		Costco costco = ctx.getBean(Costco.class);
		
		// This version of getBean only works for prototype beans
		Item item1 = ctx.getBean(Item.class, "Eggs", 5.00);
		Item item2 = ctx.getBean(Item.class, "Milk", 3.50);
		Item item3 = ctx.getBean(Item.class, "Cereal", 5.00);
		
		Item[] groceryList = {item1, item2, item3};
		
		double totalCost = costco.shop(null);
//		costco.shop();
		
//		System.out.println(totalCost);
		
	}

}
