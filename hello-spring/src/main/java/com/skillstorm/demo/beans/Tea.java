package com.skillstorm.demo.beans;

public class Tea implements Drink {

	// @Override is a guarantee to the compiler that the method overrides something
	@Override
	public void sip() {
		System.out.println("Ahhhhh");
	}
}
