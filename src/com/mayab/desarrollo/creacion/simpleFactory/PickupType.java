package com.mayab.desarrollo.creacion.simpleFactory;

public class PickupType extends ProductLine {
	
	Auto factoryProduction(String item) {
		if (item.equals("Frontier")) {
			return new PickupTypeFrontier();
		} else if (item.equals("Amarok")) {
			return new PickupTypeAmarok();
		} else return null;
	}

}
