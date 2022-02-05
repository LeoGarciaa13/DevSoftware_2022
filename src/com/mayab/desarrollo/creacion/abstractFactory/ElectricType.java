package com.mayab.desarrollo.creacion.abstractFactory;


public class ElectricType extends ProductLine{
	
	protected Auto factoryProduction(String item) {
		Auto auto = null;
		AutoComponentFactory compFactory = new ElectricComponentFactory(); 
		
		if (item.equals("Prius")) {
			
			auto = new HighClassAuto(compFactory);
			auto.setModel("Electric High Class Car - Prius");
			
		} else if (item.equals("Leaf")) {
			
			auto = new CommonClassAuto(compFactory);
			auto.setModel("Electric High Class Car - Leaf");
		}
			
		return auto;
	}

}
