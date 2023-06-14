package com.skillstorm.demo.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.demo.dtos.ItemDto;
import com.skillstorm.demo.dtos.RestaurantDto;

// @Configuration is a class that declares a bunch of beans to create

//@Component // Class level annotation that tells Spring to create a bean
// @Component is the most vague annotation for this purpose
//@Controller // Stereotype annotation that is a more opinionated version @Component
// Used for API Endpoints. Any method with @RequestMapping gets added as a endpoint

// @Controller + @ResponseBody on every method = @RestController
@RestController // Similar to @Controller, but used for JSON data
@RequestMapping("/restaurants") // Prefixes /restaurants to all methods
public class RestaurantController {
	
	// Create a Logger using the factory method
	private static final Logger log = LoggerFactory.getLogger(RestaurantController.class);

	// /restaurants/helloWorld
	@RequestMapping("/helloWorld")
	public String helloWorld() {
//		System.out.println(); // Not advised because it won't turn off in production
		log.debug("Hello World!!!"); // This comes with a timestamp, class, etc.
		log.info("This is an info log");
		return "Hello World";
	}
	
	// HTTP Method? GET
	// URL? /restaurants
	// GET /restaurants
	
	//@RequestMapping(method = RequestMethod.GET, path = "/restaurants")
	// These two are equivalent
	@GetMapping
	public List<RestaurantDto> findAllRestaurants() {
		// Spring uses Jackson Object Relational Mapper
		// to marshall the data into JSON
//		return Arrays.asList(
//			new RestaurantDto("Chick-Fil-A", "Beach and Hodges", "10/10", Arrays.asList("Chicken Sandwich", "Spicy Deluxe")),
//			new RestaurantDto("La Bella Pizza", "4th Street", "5", Arrays.asList("Chicken Parmesan Pizza", "Pepperoni Bites", "Buffalo Chicken Pizza"))
//		);
		
		return Arrays.asList(
				new RestaurantDto("Chick-Fil-A", "Beach and Hodges", "10/10", Arrays.asList(new ItemDto("Chicken Sandwich", 350), new ItemDto("Spicy Deluxe", 400))));
	}
	
	// Find a specific restaurant
	// HTTP Method? GET
	// URL? /restaurants/id
	//      OR
	//      /restaurants/restaurant-name
	
	// /restaurants/id
	@GetMapping("/{id}")
	public String findRestaurantById(@PathVariable int id) {
		// Imagine this queries the DB for a restaurant with a given ID
		
		return "Five Guys";
	}
	
	
	// Create a restaurant
	// HTTP Method? POST
	// URL? /restaurants
	
	// Take in a JSON data the contents to create a RestaurantDto
	// Return a 201 status
	@PostMapping
	public ResponseEntity<RestaurantDto> createRestaurant(@Valid @RequestBody RestaurantDto restaurant) {
		System.out.println(restaurant);
		restaurant.setAddress(restaurant.getAddress().trim());
		// ResponseEntity is good for editing status code AND editing response headers
		return new ResponseEntity<>(restaurant, HttpStatus.CREATED);
	}
	
	// UPDATE
	// HTTP Method? PUT / PATCH
	// URL? /restaurants/{id}
	@PutMapping("/{id}")
	public RestaurantDto updateRestaurant(@PathVariable int id, @RequestBody RestaurantDto restaurant) {
		
		
		// Take the data from the request body
		// Use the id present in the URL
		// Update the row in the DB with that ID with the data from the request body
		// restaurant.setId(id);
		// return service.updateRestaurant(restaurant);
		
		// Return the updated restaurant
		return restaurant;
	}
	
	
	// URL? /restaurants/{id}
	@DeleteMapping("/{id}")
	public void deleteRestaurant(@PathVariable int id) {
		// service.deleteRestaurantById(id);
	}
}
