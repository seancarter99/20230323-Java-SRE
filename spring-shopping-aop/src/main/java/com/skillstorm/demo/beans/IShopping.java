package com.skillstorm.demo.beans;

public interface IShopping {

	// Going into the store, but not buying anything
	public void shop();
	
	// Shopping with a groceryList, returns the total amount spent
	public double shop(Item[] groceryList);
}
