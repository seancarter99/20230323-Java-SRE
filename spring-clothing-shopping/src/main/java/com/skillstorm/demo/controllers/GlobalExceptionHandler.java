package com.skillstorm.demo.controllers;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

// This class will advise our controllers on specific exceptions
// This is all AOP
// This is a controller

//@ControllerAdvice Useful for sending users error.html
@RestControllerAdvice // Sends the error JSON data and alters status codes
public class GlobalExceptionHandler {

	// Create your own Exception classes and monitor for those here
	
//	@ExceptionHandler(MyCustomException.class)
	@ResponseStatus(code = HttpStatus.NOT_FOUND) // 404
	@ExceptionHandler(NoSuchElementException.class) // @AfterThrowing for every method in my project
//	public NoSuchElementExceptionDto noElementFound() {
	public void noElementFound() {
		
	}
}
