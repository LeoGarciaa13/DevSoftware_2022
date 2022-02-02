package com.mayab.desarrollo.creacion.simpleFactory;

public class SedanType extends ProductLine{
	Auto factoryProduction(String item) {
		if (item.equals("Sentra")) {
			return new SedanTypeSentra();
		} else if (item.equals("Altima")) {
			return new SedanTypeAltima();
		} else return null;
	}

}
