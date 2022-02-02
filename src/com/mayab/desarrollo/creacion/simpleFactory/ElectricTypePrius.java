package com.mayab.desarrollo.creacion.simpleFactory;

public class ElectricTypePrius extends Auto{
	
	public ElectricTypePrius() {
		model = "Prius";
		color = "Red";
		year = "2022";
		
		components.add("ElectricBattery");
	}

}
