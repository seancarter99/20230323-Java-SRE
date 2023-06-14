package com.skillstorm.demo.dtos;

public class PaymentDto {

	private String user;
	private double price;
	
	public PaymentDto() {
		super();
	}
	public PaymentDto(String user, double price) {
		super();
		this.user = user;
		this.price = price;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}

