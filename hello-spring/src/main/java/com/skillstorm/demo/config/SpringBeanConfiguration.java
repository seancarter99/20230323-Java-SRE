package com.skillstorm.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.skillstorm.demo.beans.Coffee;
import com.skillstorm.demo.beans.Drink;
import com.skillstorm.demo.beans.Person;
import com.skillstorm.demo.beans.Soda;
import com.skillstorm.demo.beans.Tea;

// I need to make it so that Spring creates my beans for me
@Configuration
public class SpringBeanConfiguration {
	
	/**
	 * Bean Scopes
	 * 
	 * singleton - One copy of the bean **
	 * prototype - Creates a new copy of the bean each time **
	 * application - Creates a bean used by the entire app
	 * request - Creates a bean for the lifespan of an HTTP request *
	 * session - Creates a bean that is used for the lifespan of a user session *
	 * websocket - Creates a bean that is used for the lifespan of a websocket
	 */

	// Keep it vague
	
	//           name of the method "drink" is the name of the bean
	//                            "by default"
	@Bean
	// @Scope is used for determining the scope of a bean
	@Scope // Singleton is the default scope
	@Primary
	public Drink drink() {
		// The returned coffee is given to the Spring IoC container
		return new Tea();
	}
	
	// More than one parameter for annotation, provide the name
	@Bean(
			initMethod = "mySpecialCustomInit", 
			destroyMethod = "mySpecialCustomDestroy", 
			name = "sodaaaaaaaaaaa")
	public Drink soda() {
		return new Soda();
	}
	
	@Bean
	public Drink anotherDrink() {
		return new Coffee();
	}
	
	@Bean
	public Person person() {
		return new Person("Bob");
	}
	
}
