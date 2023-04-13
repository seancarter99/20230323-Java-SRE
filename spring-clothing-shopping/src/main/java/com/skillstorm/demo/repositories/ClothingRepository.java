package com.skillstorm.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.skillstorm.demo.models.Clothing;

@Repository
public interface ClothingRepository extends JpaRepository<Clothing, Long> {

	//                                   clothing.getStore().getId();
	@Query("select c from Clothing c where c.store.id = ?1")
	public List<Clothing> findAllClothesByStoreId(long id);
}
