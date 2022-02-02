package com.mayab.desarrollo.creacion.simpleFactory;

public class ElectricTypeLeaf extends Auto{
	
	public ElectricTypeLeaf() {
		model = "Leaf";
		color = "Blue";
		year = "2004";
		
		components.add("ElectricBattery");
	}

}
