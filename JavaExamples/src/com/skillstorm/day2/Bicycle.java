package com.skillstorm.day2;

public class Bicycle implements Driveable {

	@Override
	public void drive() {
		System.out.println("Driving my bike!");
	}

	@Override
	public void drive(int distance) {
		System.out.println("Driving my bike for " + distance + " miles!");
	}

	public static void main(String[] args) {
		Bicycle bike = new Bicycle();
		
		bike.drive(5);
	}
}
