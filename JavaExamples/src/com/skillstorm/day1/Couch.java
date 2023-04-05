package com.skillstorm.day1;

public class Couch {

	// Class properties
	// For encapsulation, make ALL properties private
	private int numSeats;
	private boolean isReclined;
	private String color;
	
	// Look to use a public variable if it truly is public and unique
	// public static final
	public static final String OWNER_NAME = "Sean";
	
	// If you define another constructor, you need this to declare the default constructor again
	// No-Arg constructor
	public Couch() {
		// super() or this() MUST be the first line of a constructor
		// Without explicitly calling super(), Java automatically adds super() at line 1
		System.out.println("");
	}

	// Full-arg constructor
	public Couch(int numSeats, boolean isReclined, String color) {
		super(); // Calling the parent class's constructor. (Object's constructor)
		this.numSeats = numSeats;
		this.isReclined = isReclined;
		this.color = color;
	}

	public int getNumSeats() {
		return this.numSeats;
	}
	
	public void setNumSeats(int newNumSeats) {
		// "this" refers to the current object calling the method
		numSeats = newNumSeats;
	}
	
	public boolean isReclined() {
		return isReclined;
	}

	public void setReclined(boolean isReclined) {
		this.isReclined = isReclined;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void toggleRecline() {
		this.isReclined = !isReclined;
	}

	public static void main(String[] args) {
		Couch c = new Couch();
	}
}
