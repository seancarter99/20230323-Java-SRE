package com.skillstorm.demo.beans;

import org.springframework.stereotype.Component;

@Component
// Singleton scope
public class Costco implements IShopping {
	
	@Override
	public void shop() {
		System.out.println("Just browsing!");
	}

	@Override
	public double shop(Item[] groceryList) {
		if (groceryList == null) {
			throw new RuntimeException("Must have a grocery list!");
		}
		double totalPrice = 0;
		for (Item item : groceryList) {
			totalPrice += item.getPrice();
		}
		return totalPrice;
	}
}
