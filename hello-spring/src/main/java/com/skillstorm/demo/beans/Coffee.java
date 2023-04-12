package com.skillstorm.demo.beans;

public class Coffee implements Drink {

	@Override
	public void sip() {
		System.out.println("Ouch I burnt my tongue!");
	}

}
