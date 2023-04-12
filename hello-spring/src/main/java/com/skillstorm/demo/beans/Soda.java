package com.skillstorm.demo.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Soda implements Drink, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
	
	@Autowired
	@Qualifier("anotherDrink")
	private Drink drink;
	
	@Override
	public void sip() {
		System.out.println("Yum");
	}

	@Override
	public void setBeanName(String name) {
		// Running logic in here that you want when a bean becomes aware of its
		// own name
		
		System.out.println("Bean Name Aware : " + name);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("Bean Factory Aware : " + beanFactory);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		Drink drinkz = (Drink) applicationContext.getBean("drink");
		System.out.println("Application Context Aware : " + applicationContext);
//		System.out.println(drink);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// Helps avoid null pointer exceptions
		// All properties have been set and initialized
//		drink.sip(); // No null pointer exception occurs
//		System.out.println(drink);
		System.out.println("Initializing Bean");
	}
	
	public void mySpecialCustomInit() {
		// If you want to run any initialization logic, do so here
		System.out.println("Custom Init");
	}

	@Override
	public void destroy() throws Exception {
		// Logic that runs right before the bean is destroyed
		System.out.println("Disposable Bean");
	}
	
	public void mySpecialCustomDestroy() {
		System.out.println("Custom Destroy");
	}
}
