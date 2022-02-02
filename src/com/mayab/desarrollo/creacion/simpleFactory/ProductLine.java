package com.mayab.desarrollo.creacion.simpleFactory;

public abstract class ProductLine {
		
	abstract Auto factoryProduction(String item);
	
	public Auto ensableCar(String type) {
		Auto auto = factoryProduction(type);
		System.out.println("----- Building a " + auto.getModel() + "´-----");
		auto.builded();
		auto.paint();
		auto.QAcar();
		return auto;
	}

}
