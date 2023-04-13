package com.skillstorm.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.demo.models.Store;

// Repository is the layer that talks to the database

// Spring will create a bean of this for me (using @ComponentScan part of @SpringBootApplication)
@Repository // Stereotype annotation for repositories (@Component with more meaning)
// CrudRepository - Contains CRUD operation queries
// PagingAndSortingRepository - Useful for pagination (ORDER BY, LIMIT, OFFSET)
// JpaRepository - Contains the most amount of queries OOTB
public interface StoreRepository extends JpaRepository<Store, Long> {

	// Write custom queries in here
	
//	@Query(nativeQuery = true) // Advocate AGAINST
	//                         AS s     Dot notation in Java 
	@Query("SELECT s FROM Store s WHERE s.name = ?1")
	public List<Store> afdsafdsa(String name); // JPQL
//  public List<Store> findByName(String name); // Method Name JPA
	
//	@Query("select distinct …​ where x.lastname = ?1 and x.firstname = ?2")
//	public List<Store> someMethod(String lastname, String firstname);
}
