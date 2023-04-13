package com.skillstorm.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.skillstorm.demo.dtos.ClothingDto;
import com.skillstorm.demo.models.Clothing;
import com.skillstorm.demo.models.Store;
import com.skillstorm.demo.repositories.ClothingRepository;
import com.skillstorm.demo.repositories.StoreRepository;

@Service
@Transactional // If any exception is thrown in any of the methods of this class. Automatically rolls back
public class ClothingService {

	@Autowired
	private ClothingRepository clothingRepository;
	
	@Autowired 
	private StoreRepository storeRepository;
	
	public List<ClothingDto> findAllClothesByStoreId(long id) {
		return clothingRepository.findAllClothesByStoreId(id)
				.stream()
				.map(c -> c.toDto())
				.toList();
	}

	public ClothingDto createClothes(ClothingDto clothesData) {
		// storeId 1 but there is no store with an id of 1... what now?
		Store store = storeRepository.findById(clothesData.getStoreId())
				.orElseThrow(); // I tried to create clothes, but no store existed (4xx)
		// Here we know the store exists
		Clothing clothing = new Clothing(clothesData.getId(), clothesData.getSize(), clothesData.getBrand(), store);
		// Persist the clothing item
		return clothingRepository.save(clothing).toDto();
	}
}
