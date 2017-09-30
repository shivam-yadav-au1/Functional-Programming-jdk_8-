package com.kodecamp.generic;

public class Person {
	
	private String id;
	private String name;
	
	
	public Person(final String id,final String name) {
			
		this.id = id;
		this.name = name;
	}
	
	public String id() {
		return id;
	}
	
	public String name() {
		return name;
	}

}
