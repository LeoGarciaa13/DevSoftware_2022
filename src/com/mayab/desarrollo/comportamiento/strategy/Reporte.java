package com.mayab.desarrollo.comportamiento.strategy;

public abstract class Reporte {
	public Exportable expBehavior; 
	
	
	public Reporte() {
		
	}
	
	public void setExportBehavior(Exportable exp) {
		expBehavior = exp;
	}
	
	public void performExport() {
		expBehavior.export();
	}
	
	// ABSTACTS METHODS 
	public abstract void printReporte();
	
	public abstract void addArticulo(Articulo articulo); 
}
