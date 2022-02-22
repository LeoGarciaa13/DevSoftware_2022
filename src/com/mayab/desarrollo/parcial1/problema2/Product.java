package com.mayab.desarrollo.parcial1.problema2;

public abstract class Product {
	
	String productBaseForm = "Normal Product";
	
	public String getProductBaseForm() {
		return productBaseForm; 
	}
	
	// Asbtract Methods
	public abstract double basePrice();
	public abstract double finalPrice(); 
	
}
