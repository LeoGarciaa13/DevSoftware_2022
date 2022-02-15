package com.mayab.desarrollo.estructura.adapter;

import java.util.Date;

public class OldPerson {
	String name;
	String lastName;
	String dateBirth; 
	
	public OldPerson(String name, String lastName, String dateBirth) {
		this.name = name; 
		this.lastName = lastName; 
		this.dateBirth = dateBirth;
		
	}
	
	public String getName() {
		return name; 
	}
	
	public String getLastName() {
		return lastName;
	}

	public String getDateBirth() {
		return dateBirth;
	}
	
}
