package com.mayab.desarrollo.parcial1.problema2;

public class Discount extends TaxesDecorator {
	Product product; 
	
	public Discount(Product product) {
		this.product = product; 
	}

	@Override
	public String getProductBaseForm() {
		// Add the discounted tag 
		return "Discounted + " + product.getProductBaseForm();
	}

	@Override
	public double basePrice() {
		// Add the discount to base price
		return product.basePrice();
	}

	@Override
	public double finalPrice() {
		// Return the final price
		double finalPrice = product.finalPrice() - 5; 
		return finalPrice;
	}
	

}
