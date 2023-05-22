package com.skillstorm.demo.controllers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.demo.services.AppUserDetailsService;

@RestController
public class HelloController {

	@Autowired
	private AppUserDetailsService appUserDetailsService;
	
	@GetMapping("/hello")
	public String hello(Principal principal, Authentication auth) {
		// Pulls from the "SecurityContext"
//		principal.getName(); // THis returns the username of currently signed in user
		System.out.println(auth.getAuthorities());
		appUserDetailsService.dummyMethod();
		return "Hello World";
	}
	
	@PostMapping("/hello")
	public String postHello() {
		return "Hello Post";
	}
	
	@GetMapping("/private")
	public String privy() {
		return "Private data";
	}
	
	// Only Admins have access to this API endpoint
	@GetMapping("/admin")
	public String admin() {
		return "SUPER SECRET ADMIN ACCESS";
	}
}
