package com.mayab.desarrollo.creacion.abstractFactory;


public class SedanType extends ProductLine{
	
	protected Auto factoryProduction(String item) {
		Auto auto = null;
		AutoComponentFactory compFactory = new SedanComponentFactory(); 
		
		if (item.equals("Altima")) {
			
			auto = new HighClassAuto(compFactory);
			auto.setModel("Sedan Common Class Car - Altima");
			
		} else if (item.equals("Sentra")) {
			
			auto = new CommonClassAuto(compFactory);
			auto.setModel("Sedan Common Class Car - Sentra");
		}
			
		return auto;
	}

}
