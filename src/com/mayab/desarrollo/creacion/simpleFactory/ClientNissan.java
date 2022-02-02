// Main Class for Factory Nissan
package com.mayab.desarrollo.creacion.simpleFactory;

public class ClientNissan {

	public static void main(String[] args) {
		ProductLine electric = new ElectricType();
		ProductLine sedan = new SedanType();
		ProductLine pickup = new PickupType();
		
		// Call for initialize production
		// Order 1
		Auto auto = electric.ensambleCar("Prius");
		System.out.println("Order 1 in Queue...delivering a "+  auto.getModel() + "\n");
		// Order 2
		auto = sedan.ensambleCar("Altima");
		System.out.println("Order 2 in Queue...delivering a "+  auto.getModel() + "\n");
		// Order 3
		auto = pickup.ensambleCar("Frontier");
		System.out.println("Order 3 in Queue...delivering a "+  auto.getModel() + "\n");
		// Order 4
		auto = pickup.ensambleCar("Amarok");
		System.out.println("Order 4 in Queue...delivering a "+  auto.getModel() + "\n");
		// Order 4
		auto = sedan.ensambleCar("Sentra");
		System.out.println("Order 5 in Queue...delivering a "+  auto.getModel() + "\n");
		// Order 1
		auto = electric.ensambleCar("Leaf");
		System.out.println("Order 6 in Queue...delivering a "+  auto.getModel() + "\n");
		

	}

}
