package com.skillstorm.demo.services;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.demo.dtos.StoreDto;
import com.skillstorm.demo.models.Store;
import com.skillstorm.demo.repositories.StoreRepository;

// Service classes are used for business logic
@Service
public class StoreService {

	@Autowired
	private StoreRepository storeRepository;
	
	public List<StoreDto> findAllStores(String name) {
		/**
		 * FunctionalInterface
		 * 
		 * forEach
		 * map
		 * filter
		 * reduce
		 */
		if (name == null) {
			return storeRepository.findAll()
					.stream()
					.map(s -> s.toDto()) // Perform some action that mutates each item in a list, use map
					.toList(); // Condense into a list
		}
		// SELECT * FROM STORES WHERE name = ?;
		return storeRepository.afdsafdsa(name)
				.stream()
				.map(s -> s.toDto())
				.toList();
		
		
		
		
//		List<StoreDto> newList = new LinkedList<>();
//		for (Store s : storeRepository.findAll()) {
//			newList.add(s.toDto());
//		}
//		return newList;
		
//		return storeRepository.findAll();
	}
	
	public StoreDto findStoreById(long id) {
		// Find a store given an id.
		// If it finds it, runs toDto() on it and returns it
		// If not, throws a NoSuchElementException() and our Exception handler will translate that to the user
		return storeRepository.findById(id)
				.orElseThrow() // (204)
				.toDto(); // NoSuchElementException -> RuntimeException
	}
	
	/**
	 * 
	 * @param storeData The data to create a store entity with
	 * @return The data of the newly created store
	 */
	public StoreDto createStore(StoreDto storeData) { // storeData will NOT contain ID. That is autogened
		// You could also create a new Store constructor that takes a StoreDto and does this same thing
		Store store = new Store(storeData.getId(), storeData.getName(), storeData.getAddress(), storeData.getSquareFootage());
		return storeRepository.save(store).toDto();
	}

	public StoreDto updateStore(StoreDto storeData) {
		Store store = new Store(storeData.getId(), storeData.getName(), storeData.getAddress(), storeData.getSquareFootage());
		return storeRepository.save(store).toDto();
	}

	public void deleteStore(long id) {
		storeRepository.deleteById(id);
	}
}
