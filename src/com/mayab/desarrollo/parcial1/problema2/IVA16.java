package com.mayab.desarrollo.parcial1.problema2;

public class IVA16 extends Product {
	Product product; 
	
	public IVA16(Product product) {
		this.product = product; 
	}

	@Override
	public String getProductBaseForm() {
		// Add the discounted tag 
		return "IVA 16% + " + product.getProductBaseForm();
	}

	@Override
	public double basePrice() {
		// Add the discount to base price
		return product.basePrice();
	}

	@Override
	public double finalPrice() {
		// Return the final price
		double finalPrice = product.finalPrice() + (0.16 * basePrice()); 
		return finalPrice;
	}
	

}
