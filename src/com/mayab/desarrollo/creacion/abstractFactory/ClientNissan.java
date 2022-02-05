package com.mayab.desarrollo.creacion.abstractFactory;

public class ClientNissan {

	public static void main(String[] args) {
		// Implementation of interfaces 
		ProductLine sedan = new SedanType();
		ProductLine pickup = new PickupType();
		ProductLine electric = new ElectricType();
		
		// Call for initialization 
		// Order 1
		Auto auto = sedan.ensambleCar("Altima");
		System.out.println("Order 1 in deliver..." + "\n" + "Special Components of "+ auto + "\n");
		// Order 2
		auto = electric.ensambleCar("Prius");
		System.out.println("Order 2 in deliver..." + "\n" + "Special Components of "+ auto + "\n");
		// Order 3
		auto = pickup.ensambleCar("Amarok");
		System.out.println("Order 3 in deliver..." + "\n" + "Special Components of "+ auto + "\n");
		// Order 4
		auto = pickup.ensambleCar("Frontier");
		System.out.println("Order 4 in deliver..." + "\n" + "Special Components of "+ auto + "\n");
		// Order 5
		auto = sedan.ensambleCar("Sentra");
		System.out.println("Order 5 in deliver..." + "\n" + "Special Components of "+ auto + "\n");
		// Order 6
		auto = electric.ensambleCar("Leaf");
		System.out.println("Order6 in deliver..." + "\n" + "Special Components of "+ auto + "\n");
		

		
		

	}

}
