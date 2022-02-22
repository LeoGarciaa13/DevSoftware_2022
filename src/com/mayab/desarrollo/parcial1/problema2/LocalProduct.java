package com.mayab.desarrollo.parcial1.problema2;

public class LocalProduct extends Product {
	
	public LocalProduct() {
		productBaseForm = "Local Product";
	}

	@Override
	public double basePrice() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public double finalPrice() {
		// TODO Auto-generated method stub
		double finalPrice = basePrice(); 
		return finalPrice;
	}

	

}
