package com.skillstorm.day2;

// Similar to interfaces, you may NOT instantiate an abstract class
public abstract class Shape {

	// Abstract classes may have non-static properties
	private String color;
	
	public Shape() {
		this("Red");
	}
	
	// Abstract classes may have constructors
	public Shape(String color) {
		super();
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	// Unlike an interface, abstract keyword is required
	public abstract double getArea();

	public static void main(String[] args) {
//		Shape shape = new Shape("Red");
	}
}

class Square extends Shape {
	
	private double length;
	
	public Square() {
		super();
	}
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double getArea() {
		return this.length * this.length;
	}
}

class Circle extends Shape {
	
	private double radius;

	@Override
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public double getCircumference() {
		return 2 * Math.PI * this.radius;
	}
	
	public double getDiameter() {
		return this.radius * 2;
	}
}