package com.skillstorm.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListingsController {

	@GetMapping("/listings")
	public String listings() {
		return "listings";
	}
}
