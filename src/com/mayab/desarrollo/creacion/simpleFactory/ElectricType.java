package com.mayab.desarrollo.creacion.simpleFactory;

public class ElectricType extends ProductLine{
	Auto factoryProduction(String item) {
		if (item.equals("Leaf")) {
			return new ElectricTypeLeaf();
		} else if (item.equals("Prius")) {
			return new ElectricTypePrius();
		} else return null;
	}

}
