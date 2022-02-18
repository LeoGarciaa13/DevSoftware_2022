package com.mayab.desarrollo.comportamiento.strategy;

import java.util.ArrayList;

public class ReporteVentas extends Reporte{
	public ArrayList <Articulo> lista; 
	
	public ReporteVentas() {
			
		lista = new ArrayList<Articulo>();
		expBehavior = new JSON();
		
	}
		
	public void addArticulo(Articulo articulo) {
		lista.add(articulo);
	}
	
	
	public void printReporte() {
		System.out.println("----Reporte de Ventas-------\n");
		expBehavior.export();
		for(Articulo a: lista) {
			System.out.println("- " + a.getNombre() + " | " + a.getCosto() + " | " + a.getCantidad());
		}
		System.out.println("------------------------------\n");
	}

}
