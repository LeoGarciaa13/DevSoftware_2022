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
}
