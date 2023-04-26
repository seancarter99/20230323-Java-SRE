package com.skillstorm.day1;

import java.util.Scanner;

public class Holder {
	
	Holder link;

	int value = 1;

	public Holder(int val) { this.value = val;}
	
	public static void main(String[] args) {
		final Holder a = new Holder(5);
		Holder b = new Holder(10);
		a.link = b;
		b.link = setIt(a, b);
		System.out.println(a.link.value +  " " + b.link.value);
	}
	
	public static Holder setIt(final Holder x, final Holder y) {
		x.link = y.link;
		return x;
	}
}

class Demo {
	
	public static void main(String[] args) {
		
		// So long as the user inputs y continue
		Scanner scan = new Scanner(System.in);
		// do-while
		// Always go at least once, then ask if they want to continue
		String answer = "";
		do {
			System.out.println("Do you want to continue? (y/n)");
			answer = scan.next();
		} while(answer.equals("y"));
		
		System.out.println("End!");
		// while
		// Ask up front if they want to play, then, if yes, same as above
		
		System.out.println("----------------------------");
		
		System.out.println("Do you want to play? (y/n)");
		answer = scan.next();
		while (answer.equals("y")) {
			System.out.println("Do you want to continue? (y/n)");
			answer = scan.next();
		}
		
		System.out.println("End! (Part 2)");
	}
}