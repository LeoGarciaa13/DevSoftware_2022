package com.mayab.desarrollo.estructura.adapter;

public class NewPerson implements INewPerson {
	String name;
	String age;
	
	public NewPerson(String name, String age) {
		this.name = name; 
		this.age = age; 
	}
	// New Person Methods
	public String getName() {
		return name;
	}
	
	public String getAge() {
		return age;
	}

}
