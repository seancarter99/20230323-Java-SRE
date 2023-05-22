package com.skillstorm.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.demo.models.AppUser;
import com.skillstorm.demo.services.AppUserDetailsService;

@RestController
public class UserController {
	
	@Autowired
	private AppUserDetailsService appUserDetailsService;
	
	// /register?username=user&password=pass
	@PostMapping("/register")
	public ResponseEntity<Void> register(@RequestBody AppUser user) {
		appUserDetailsService.register(user);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
}
