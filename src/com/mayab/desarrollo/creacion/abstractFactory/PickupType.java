package com.mayab.desarrollo.creacion.abstractFactory;

public class PickupType extends ProductLine{
	
	protected Auto factoryProduction(String item) {
		Auto auto = null;
		AutoComponentFactory compFactory = new PickupComponentFactory(); 
		
		if (item.equals("Amarok")) {
			
			auto = new RoughUseClassAuto(compFactory);
			auto.setModel("Pickup Rough Use Class Car - Amarok");
			
		} else if (item.equals("Frontier")) {
			
			auto = new RoughUseClassAuto(compFactory);
			auto.setModel("Pickup Rough Use Class Car - Frontier");
		}
			
		return auto;
	}

}
