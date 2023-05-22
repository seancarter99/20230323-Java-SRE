package com.skillstorm.demo.models;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name = "users")
public class AppUser implements UserDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long id;
	
	@Column
	private String username;
	
	@Column
	private String password;
	
	@Column
	private String role; // USER, ADMIN, MOD, SUPER_ADMIN
	
	public AppUser() {}
	
	public AppUser(String username, String password, String role) {
		super();
		this.username = username;
		this.password = password;
		this.role = role;
	}



	public AppUser(long id, String username, String password, String role) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
	}



	// private Set<Authority> authorities; // Mapped to another table in the database
	
	// Store timestamp of when last password change was

	// Return a collection in case the user has many authorities
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// Authority is just anything
		// Role is ROLE_
		
		// read
		// ROLE_USER
		Set<SimpleGrantedAuthority> authorities = new HashSet<>();
		// Mapping the String to something Spring Security will recognize
		SimpleGrantedAuthority userRole = new SimpleGrantedAuthority(role);
		authorities.add(userRole);
		
		return authorities;
	}

	@Override
	public String getUsername() {
		return this.username;
	}
	
	@Override
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// Use the timestamp above to determine if they need reset password
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}
