package com.mayab.desarrollo.parcial1.problema2;

/*
 * 
 * IMPLEMENTACION DE PATRON DECORATOR
 * PROBLEMA 2
 * LEONARDO GARCIA
 * 
 */

public class ProductSystemManager {

	public static void main(String[] args) {
		// MAIN
		// New Product 1
		System.out.println("----------------------------------------------------------");
		Product product = new LocalProduct();
		System.out.println(product.getProductBaseForm() + "\nBase Price: " + product.basePrice() + " $\n" +
				 "Base Final Price: " + product.finalPrice() + " $\n" );
		// New Product 2
		System.out.println("----------------------------------------------------------");
		Product product2 = new BorderProduct();
		product2 = new IVA16(product2);
		product2 = new BorderTax(product2);
		System.out.println(product2.getProductBaseForm() + "\nBase Price: " + product2.basePrice() + " $\n" +
				 "Base Final Price: " + product2.finalPrice() + " $\n" );
		// New Product 2
		System.out.println("----------------------------------------------------------");
		Product product3 = new BorderProduct();
		product3 = new IVA8(product3);
		product3 = new Discount(product3);
		System.out.println(product3.getProductBaseForm() + "\nBase Price: " + product3.basePrice() + " $\n" +
				 "Base Final Price: " + product3.finalPrice() + " $\n" );
				

	}

}
