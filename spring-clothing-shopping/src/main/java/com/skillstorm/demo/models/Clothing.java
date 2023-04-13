package com.skillstorm.demo.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.skillstorm.demo.dtos.ClothingDto;

// We need to use Hibernate annotations to "map" the Java object (Entity) to the database table
// DAO is used JDBC

// CTL + Space ... Enter

@Entity
@Table(name = "clothing")
public class Clothing {
	
	// These are the columns of the clothing table
	@Id // Indicates that this is the primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto-increment
	// If you want to rename the column. (By default, uses name of variable)
	@Column(name = "clothing_id")
	private long id;
	
	@Column
	private String size;
	
	@Column
	private String brand;
	
	@ManyToOne
	@JoinColumn(name = "store_id") // foreign key in SQL (id)
	private Store store;
	
	public Clothing() {
		
	}

	public Clothing(long id, String size, String brand, Store store) {
		super();
		this.id = id;
		this.size = size;
		this.brand = brand;
		this.store = store;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}
	
	public ClothingDto toDto() {
		return new ClothingDto(id, store.getId(), size, brand);
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
		Clothing other = (Clothing) obj;
		return id == other.id;
	}
}
