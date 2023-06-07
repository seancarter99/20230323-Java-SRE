package com.skillstorm.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {

	@GetMapping("/accounts")
	public String accounts() {
		return "accounts";
	}
}
