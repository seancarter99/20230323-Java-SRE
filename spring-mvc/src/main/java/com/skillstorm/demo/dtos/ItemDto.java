package com.skillstorm.demo.dtos;

public class ItemDto {
	private String name;
	private int calorieCount;
	
	public ItemDto() {
		
	}
	
	public ItemDto(String name, int calorieCount) {
		this.name = name;
		this.calorieCount = calorieCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalorieCount() {
		return calorieCount;
	}

	public void setCalorieCount(int calorieCount) {
		this.calorieCount = calorieCount;
	}
}
