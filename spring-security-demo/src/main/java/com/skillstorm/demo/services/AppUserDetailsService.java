package com.skillstorm.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.skillstorm.demo.models.AppUser;
import com.skillstorm.demo.repositories.UserRepository;

@Service
public class AppUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// If the user tries to log into a user that doesn't exist
		AppUser user = userRepository.findByUsername(username)
						.orElseThrow(() -> new UsernameNotFoundException(username + " not found."));
		// No Password checking here, but Spring Security uses this method to get the user
		// Then, it uses that User object to check the credentials to see if valid
		return user;
	}
	
	public void register(AppUser user) {
		Optional<AppUser> foundUser = userRepository.findByUsername(user.getUsername());
		
		// if I find the user with that username
		if (foundUser.isPresent()) {
			// Custom Exception
			throw new RuntimeException("User with that username is already taken");
		}
		// If this line isn't present, Spring Security will not save user because
		// "Password doesn't look like BCrypt"
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		user.setRole("ROLE_USER"); // No matter what they pick, put them as a user
		userRepository.save(user); // Added user to the DB
	}

	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public void dummyMethod() {
		System.out.println("Dummy method");
	}
}
