package com.mayab.desarrollo.comportamiento.strategy;

import java.util.ArrayList;

public class ReporteMensual extends Reporte {
	public ArrayList <Articulo> lista; 
	
	public ReporteMensual() {
		
		lista = new ArrayList<Articulo>();
		expBehavior = new PDF();
	}
	
	public void addArticulo(Articulo articulo) {
		lista.add(articulo);
	}
	
	public void printReporte() {
		System.out.println("----Reporte Mensual-------\n");
		expBehavior.export();
		for(Articulo a: lista) {
			System.out.println("- " + a.getNombre() + " | " + a.getCosto() + " | " + a.getCantidad());
		}
		System.out.println("------------------------------\n");
	}

}
