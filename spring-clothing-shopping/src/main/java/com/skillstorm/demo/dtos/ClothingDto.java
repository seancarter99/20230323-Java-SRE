package com.skillstorm.demo.dtos;

import java.util.Objects;

public class ClothingDto {

	private long id;
	private long storeId;
	private String size;
	private String brand;
	
	public ClothingDto() {
		
	}

	public ClothingDto(long id, long storeId, String size, String brand) {
		super();
		this.id = id;
		this.storeId = storeId;
		this.size = size;
		this.brand = brand;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getStoreId() {
		return storeId;
	}

	public void setStoreId(long storeId) {
		this.storeId = storeId;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, id, size, storeId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClothingDto other = (ClothingDto) obj;
		return Objects.equals(brand, other.brand) && id == other.id && Objects.equals(size, other.size)
				&& storeId == other.storeId;
	}

	@Override
	public String toString() {
		return "ClothingDto [id=" + id + ", storeId=" + storeId + ", size=" + size + ", brand=" + brand + "]";
	}
}
