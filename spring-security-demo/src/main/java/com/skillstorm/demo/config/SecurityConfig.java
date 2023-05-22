package com.skillstorm.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.RequestMatcher;

@Configuration
@EnableGlobalMethodSecurity(jsr250Enabled = true, prePostEnabled = true) // It allows me to use AOP security annotations
public class SecurityConfig  { //extends WebSecurityConfigurerAdapter { // OLD WAY

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		// Use the http object to configure access to our controllers
		http.authorizeRequests()
			.mvcMatchers(HttpMethod.POST, "/hello", "/register").permitAll()
			.mvcMatchers("/hello", "/hello/**").authenticated() // WIll also deny /hello/
//			.mvcMatchers("/admin", "/admin/**").hasAuthority("ROLE_ADMIN")
			.mvcMatchers("/admin", "/admin/**").hasRole("ADMIN") // Same as line above
//			.antMatchers("/hello").denyAll() // /hello/ are allowed
			.anyRequest().permitAll(); // If not specified, permit all
		
//		http.authorizeHttpRequests()
//			.anyRequest().permitAll();
		
//			.anyRequest().permitAll(); // Unauthenticated access // Ill Advised
		
		// In React, create a form that asks for the username and password, then add Authentication
		// Header to the HTTP request with that data
		http.httpBasic(); // This allows it to work with React
		
		http.csrf().disable();
		
		return http.build(); // Builder design pattern
	}
	
	// Spring Security requires me to use a password encoder to encode my passwords
	// BCrypt hashes the user password
	// Hashing is one way
	// password -> fdajfhdasjlfjljkljrk324ekak
	@Bean
	public PasswordEncoder passwordEncoder() {
		// The NoOp just stores as plain text
//		return NoOpPasswordEncoder.getInstance();
		return new BCryptPasswordEncoder(10);
	}
}
