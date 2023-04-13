package com.skillstorm.demo.dtos;

import java.util.Objects;

public class StoreDto {

	private long id;
	private String name;
	private String address;
	private double squareFootage;
	
	public StoreDto() {
		
	}

	public StoreDto(long id, String name, String address, double squareFootage) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.squareFootage = squareFootage;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSquareFootage() {
		return squareFootage;
	}

	public void setSquareFootage(double squareFootage) {
		this.squareFootage = squareFootage;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, id, name, squareFootage);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StoreDto other = (StoreDto) obj;
		return Objects.equals(address, other.address) && id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(squareFootage) == Double.doubleToLongBits(other.squareFootage);
	}
}
