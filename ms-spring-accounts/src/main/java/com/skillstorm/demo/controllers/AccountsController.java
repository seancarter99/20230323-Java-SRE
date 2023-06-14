package com.skillstorm.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.demo.services.PaymentService;

@RestController
public class AccountsController {
	
	@Autowired
	private PaymentService paymentService;

	@GetMapping("/accounts")
	public String accounts() {
		return "accounts";
	}
	
	@GetMapping("/accounts/payment")
	public void payments(@RequestParam String user) {
		paymentService.processPayment(10.00, user);
	}
}
