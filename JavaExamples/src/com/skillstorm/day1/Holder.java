package com.skillstorm.day1;

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
