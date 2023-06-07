package com.skillstorm.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

	@GetMapping("/cache/listings")
	public String cachedListings() {
		return "Cached Listings (Courtesy of Circuit Breaker)";
	}
}
