package com.mayab.desarrollo.creacion.abstractFactory;

public abstract class ProductLine {
	
	protected abstract Auto factoryProduction(String item);
	
	public Auto ensambleCar(String type) {
		Auto auto = factoryProduction(type); 
		System.out.println("----- Building a " + auto.getModel() + "----");
		auto.ensambleComponents();
		auto.builded();
		auto.paint();
		auto.QAcar();
		return auto; 
	}

}
