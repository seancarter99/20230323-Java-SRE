package com.skillstorm.day2;

public class Car implements Driveable {

	@Override
	public void drive() {
		System.out.println("Vroom!");
	}

	@Override
	public void drive(int distance) {
		System.out.println("Vroom! (For " + distance + " miles)");
	}
	
	static {
		// A static initializer
		// Useful for initializing any values BEFORE main execution
	}
	
	public static void main(String[] args) {
		Bicycle bike = new Bicycle();
		Car car = new Car();
		Truck truck = new Truck();
		
//		TestDrive.testDrive(bike);
		TestDrive.testDrive(car);
		TestDrive.testDrive(truck);
	}
}

class Truck extends Car {
	
	@Override
	public void drive() {
		System.out.println("KABOOM");
	}
	
	public void removeMuffler() {
		System.out.println("Removing muffler");
	}
}

class TestDrive {
	
	public static void testDrive(Driveable entity) {
		entity.drive();
		// To call removeMuffler (a truck specific method)
		// We need check if the entity IS a truck

		// ClassCastException
//		Truck truck = (Truck) entity;
//		truck.removeMuffler();
		
		if (entity instanceof Truck) {
			// Cast to a truck
			Truck truck = (Truck) entity;
			truck.removeMuffler();
		}
	}
	

}