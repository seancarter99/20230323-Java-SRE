package com.skillstorm.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.demo.dtos.ClothingDto;
import com.skillstorm.demo.services.ClothingService;

@RestController
public class ClothingController {
	
	@Autowired
	private ClothingService clothingService;
	
	// Get all clothes by a given store
	@GetMapping("/stores/{id}/clothes")
	public List<ClothingDto> findAllClothesByStoreId(@PathVariable long id) {
		return clothingService.findAllClothesByStoreId(id);
	}
	
	// /clothes?size=medium
	
	@PostMapping("/stores/{id}/clothes")
	public ClothingDto createClothesByStoreId(@PathVariable long id, @RequestBody ClothingDto clothesData) {
		clothesData.setStoreId(id);
		return clothingService.createClothes(clothesData);
	}
}
