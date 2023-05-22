package com.skillstorm.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.demo.models.AppUser;

@Repository
public interface UserRepository extends JpaRepository<AppUser, Long> {

	// When creating a user, make sure one doesn't already exist with that username
	public Optional<AppUser> findByUsername(String username);
}
