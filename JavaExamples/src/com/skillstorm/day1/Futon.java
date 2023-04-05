package com.skillstorm.day1;

// Futon is a type of Couch
public class Futon extends Couch {


//	String color; You can do this, but I do not recommend. Use the parent class
	
	// Is the futon a bed or a couch right now?
	boolean isInBedState;

	public Futon() {
		super();
	}
	
	public Futon(int numSeats, boolean isReclined, String color, boolean isInBedState) {
		// Instead on initializing here
//		this.numSeats = numSeats;
		super(numSeats, isReclined, color);
		this.isInBedState = isInBedState;
	}
	
	// A nice annotation for developers
	// It will throw an a compilation error if the function doesn't override
	// anything
	@Override
	public void toggleRecline() {
		// Futon's method reclines the couch AND makes it a bed
		// We can use super to call the overriden method
		// Couch's toggle changes the recline. Why write the logic twice?
		super.toggleRecline();
		this.isInBedState = !this.isInBedState;
	}
	
//	 CTL + / is comment a line
	
	
}