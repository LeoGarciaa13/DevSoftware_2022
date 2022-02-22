package com.mayab.desarrollo.parcial1.problema2;

public class BorderProduct extends Product{
	
	public BorderProduct() {
		productBaseForm = "Border Product";
	}

	@Override
	public double basePrice() {
		// TODO Auto-generated method stub
		return 15;
	}

	@Override
	public double finalPrice() {
		// TODO Auto-generated method stub
		double finalPrice = basePrice(); 
		return finalPrice;
	}

}
