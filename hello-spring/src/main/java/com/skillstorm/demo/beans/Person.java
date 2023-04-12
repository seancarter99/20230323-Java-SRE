package com.skillstorm.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {

	// HAS-A Relationship
	
	// Using "dependency injection" to give a drink to the person
	// The process of asking for the item and being given it
	@Autowired
	private Drink drink;
	private String name;
	
	public Person() {
		
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public void act() {
		System.out.println("My name is " + name);
		drink.sip();
	}
}
