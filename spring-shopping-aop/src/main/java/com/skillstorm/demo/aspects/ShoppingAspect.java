package com.skillstorm.demo.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(0) // Tells Spring that this aspect should run first over other Aspects
@Aspect // Tells AspectJ that this is an Aspect. Spring will automatically create a bean of it
public class ShoppingAspect {
	
	
	// check receipt upon leaving
	// call security upon exception
	
	/**
	 * Join Point - Any possible place our Aspect could cut in (Spring AOP: method invocation)
	 * 
	 * Point Cut - Directing an Aspect to a certain join point
	 * 
	 * Advice - The logic/code the Aspect runs at a given point cut
	 */
	
	// greet upon entry
	// Advice MUST have void return
	/**
	 * execution() - Specific method execution
	 * within() - Targeting all methods in a specific package or class
	 * bean() - Spring AOP specific. Targets a specific bean name
	 */
	
	// When a function with the signature public void shop() runs, trigger annotation BEFORE it runs
	@Before("shopNoReturnNoParams() || shopGroceryList()") // Define point cut inline
//	@Before("execution(* * *())")
//	@Before("execution(public * shop())")
	public void greet() {
		System.out.println("Welcome!");
	}
	
	// We bid farewell to the customer no matter what
	@After("shopNoReturnNoParams() || shopGroceryList()")
	public void farewell() {
		System.out.println("Farewell!");
		// Additional logic
	}
	
	// checks the receipt upon leaving
	// Only check receipt if they actually bought something
	@AfterReturning("shopGroceryList()")
	public void checkReceipt() {
		System.out.println("Checking receipt");
	}
	
	// If someone tries to shop without a shopping list (null), give them advice
	@AfterThrowing(pointcut = "shopGroceryList()") 
	public void checkGroceryList() {
		System.out.println("You should probably have a shopping list!");
	}
	
	// @Around is all put together
	// ProceedingJoinPoint is the method that this advice triggered on
	@Around("shopGroceryList()")
	public void fullRoutine(ProceedingJoinPoint joinPoint) {
		// Before
		greet();
		try {
			// Yield back control to the function
			// returnVal is whatever is whatever my function returned
			// Object because we can't anticipate return type. (You can cast it though)
			Object returnVal = joinPoint.proceed();
			checkReceipt();
			// @AfterReturning
		} catch (Throwable e) {
			// Catch block runs if the function threw an exception
			// @AfterThrowing
			checkGroceryList();
		}
		// Once function finishes...
		// After
		farewell();
	}
	
//	@AfterThrowing(pointcut = "")
//	public void rollback() {
//		// rollback the transaction
//	}
	
	// Create a reusable pointcut expression
	@Pointcut("execution(public void shop())")
	public void shopNoReturnNoParams() {
		// Dummy function that just exists for the annotation
		System.out.println("Inside pointcut!"); // This code never runs
	}
	
	// Pointcut for shopping with grocerylist
	@Pointcut("execution(public double shop(com.skillstorm.demo.beans.Item[]))")
	public void shopGroceryList() {}
	
//	@Pointcut("within(com.skillstorm.demo.beans.Costco)")
//	@Pointcut("bean(costco)")
}
