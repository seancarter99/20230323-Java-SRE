package com.skillstorm.day2;

import java.util.Objects;

public class Song {

	private String name;
	private int year;
	private String artistName;
	
	public Song() {}
	
	public Song(String name, int year, String artistName) {
		super();
		this.name = name;
		this.year = year;
		this.artistName = artistName;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(artistName, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Song))
			return false;
		Song other = (Song) obj;
		return Objects.equals(artistName, other.artistName) && Objects.equals(name, other.name);
	}

	public static void main(String[] args) {
		Song s = new Song("Let it Go", 2013, "I. Menzel");
		Song s2 = new Song("Let it Go", 2015, "I. Menzel");
		
		System.out.println(s.equals(s2));
	}
	
	
}
