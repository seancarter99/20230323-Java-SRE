package com.skillstorm.demo.dtos;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Data Transfer Object
 * 
 * DTOs are great for choosing what data to expose/accept
 * 
 * User DTO
 * I probably want to send back their username, but not the password
 * 
 */

public class RestaurantDto {

	/**
	 * JSR-303 (Bean/Object Validation)
	 * 
	 * Abstract validation logic behind annotations
	 * 
	 * @NotNull - Prevents null values from being passed in
	 * @NotEmpty - Needs at least 1 item in it (lists, maps, etc)
	 * @NotBlank - Not Null and not empty ("" is not allowed)
	 * @Min | @Max - Useful for setting bounds
	 * @Pattern - Used to apply a regex pattern to a string
	 * @Email - Used to evaluate a valid email or not
	 * @Size - Useful for lists, maps, etc. to make sure they adhere to a length/size requirements
	 * @Past - For dates, ensures that this occurred in the past
	 * @Future - For dates, ensures that this date hasn't occurred yet
	 */
	
	@NotBlank
	private String name; // "         Sean Carter     " -> "Sean Carter"
	
	@NotBlank
	private String address;
	
	// Omits value from the JSON
	@JsonIgnore
	private String starRating;
	
	@Size(min = 1, max = 2)
	private List<ItemDto> menu;
	
	public RestaurantDto() {
		
	}

	public RestaurantDto(String name, String address, String starRating, List<ItemDto> menu) {
		super();
		this.name = name;
		this.address = address;
		this.starRating = starRating;
		this.menu = menu;
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

	public String getStarRating() {
		return starRating;
	}

	public void setStarRating(String starRating) {
		this.starRating = starRating;
	}

	public List<ItemDto> getMenu() {
		return menu;
	}

	public void setMenu(List<ItemDto> menu) {
		this.menu = menu;
	}

	@Override
	public String toString() {
		// This is not what is translated into JSON
		return "RestaurantDto [name=" + name + ", address=" + address + ", starRating=" + starRating + ", menu=" + menu
				+ "]";
	}
}
