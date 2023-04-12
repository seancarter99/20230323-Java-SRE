package com.skillstorm.demo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// @Configuration is a class that declares a bunch of beans to create

//@Component // Class level annotation that tells Spring to create a bean
// @Component is the most vague annotation for this purpose
//@Controller // Stereotype annotation that is a more opinionated version @Component
// Used for API Endpoints. Any method with @RequestMapping gets added as a endpoint

// @Controller + @ResponseBody on every method = @RestController
@RestController // Similar to @Controller, but used for JSON data
public class RestaurantController {

	@RequestMapping("/helloWorld")
	public String helloWorld() {
		return "Hello World";
	}
	
	// HTTP Method? GET
	// URL? /restaurants
	// GET /restaurants
	
	//@RequestMapping(method = RequestMethod.GET, path = "/restaurants")
	// These two are equivalent
	@GetMapping("/restaurants")
	public List<String> findAllRestaurants() {
		// Spring uses Jackson Object Relational Mapper
		// to marshall the data into JSON
		return Arrays.asList("Chick-Fil-A", "Five Guys", "Smash Burger");
	}
	
	// Find a specific restaurant
	// HTTP Method? GET
	// URL? /restaurants/id
	//      OR
	//      /restaurants/restaurant-name
	
	@GetMapping("/restaurants/{id}")
	public String findRestaurantById(@PathVariable int id) {
		// Imagine this queries the DB for a restaurant with a given ID
		
		return "Five Guys";
	}
}
