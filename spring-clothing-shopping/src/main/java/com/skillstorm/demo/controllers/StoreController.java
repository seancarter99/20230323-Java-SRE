package com.skillstorm.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.demo.dtos.StoreDto;
import com.skillstorm.demo.services.StoreService;

@RestController // @Controller + @ResponseBody on every method
@RequestMapping("/stores") 
@CrossOrigin // By default allows ALL origins access
public class StoreController {

	// Get controller to talk to service
	@Autowired
	private StoreService storeService;
	
	
	// /stores
	// /stores?name=Nike
	@GetMapping
	// @RequestParam is your query parameters
	public List<StoreDto> findAllStores(@RequestParam(required = false) String name) {
		return storeService.findAllStores(name);
	}
	
	@GetMapping("/{id}")
	public StoreDto findStoreById(@PathVariable long id) {
		return storeService.findStoreById(id);
	}
	
	// /stores
	// /stores
	@PostMapping
	public ResponseEntity<StoreDto> createStore(@RequestBody StoreDto storeData) {
		StoreDto store = storeService.createStore(storeData);
		return new ResponseEntity<>(store, HttpStatus.CREATED);
	}
	
	
	@PutMapping("/{id}")
	public StoreDto updateStore(@PathVariable long id, @RequestBody StoreDto storeData) {
		storeData.setId(id);
		return storeService.updateStore(storeData);
		// Call the service to update the store
		// Send back an HTTP response of 200
		
	}
	
	@DeleteMapping("/{id}")
	public void deleteStore(@PathVariable long id) {
		storeService.deleteStore(id);
	}
}
