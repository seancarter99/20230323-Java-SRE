package com.skillstorm.day2;

// Interfaces CANNOT be instantiated
public interface Driveable {

	
	// abstract method
	public void drive();
	
	public void drive(int distance);
	
	
	
	
	
	// You may have static methods with bodies in an interface
	public static void main(String[] args) {
//		Driveable drive = new Driveable();
	}
	
	// You may also have static properties
	// Any variable in an interface is automatically
	// public static final
	int x = 10;
}
