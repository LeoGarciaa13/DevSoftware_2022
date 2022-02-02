package com.mayab.desarrollo.creacion.simpleFactory;

import java.util.ArrayList;

public abstract class Auto {
	String model; 
	String color;
	String year;
	ArrayList components = new ArrayList();
	
	
	void ensambleComponents() {
		System.out.println("Building a "+ model);
		System.out.println("In color "+ color);
		System.out.println("Of year "+ year);
		System.out.println("With this special components: ");
		for (int i = 0; i < components.size(); i++) {
			System.out.println("   " + components.get(i));
		} 
	}
	
	void paint() {
		System.out.println("The car is been painted");
	}
	
	void builded() {
		System.out.println("The car is been builded");
	}
	
	void QAcar() {
		System.out.println("The car is been tested");
	}
	
	public String getModel(){
		return model; 
	}
	
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + model + " ----\n");
		display.append(color + "\n");
		display.append(year + "\n");
		for (int i = 0; i < components.size(); i++) {
			display.append((String )components.get(i) + "\n");
		}
		return display.toString();
	}
	
	

}
