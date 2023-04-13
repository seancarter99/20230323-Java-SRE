package com.skillstorm.demo.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.skillstorm.demo.dtos.StoreDto;

@Entity
@Table(name = "store")
// Lombok
public class Store {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "store_id")
	private long id;
	
	@Column(name = "store")
	private String name;
	
	@Column
	private String address;
	
	@Column(name = "square_footage")
	private double squareFootage;
	
//	@OneToMany(mappedBy = "store")
//	private List<Clothing> clothes;
	
	public Store() {
		
	}

	public Store(long id, String name, String address, double squareFootage) {
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
	
	/**
	 * Method that converts the entity into the DTO
	 * @return The DTO
	 */
	public StoreDto toDto() {
		return new StoreDto(id, name, address, squareFootage);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Store other = (Store) obj;
		return id == other.id;
	}
	
	
}
