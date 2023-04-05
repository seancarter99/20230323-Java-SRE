package com.skillstorm.day2;

public class Runtime {

	public static void fnA() {
		fnB();
		fnC();
	}
	public static void fnB() {}
	public static void fnC() {}
	
	public static void main(String[] args) {
		fnA();
		fnB();
	}
}
