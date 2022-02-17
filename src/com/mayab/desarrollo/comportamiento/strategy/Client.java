package com.mayab.desarrollo.comportamiento.strategy;

public class Client {
	
	public static void main(String[] args) {
		// Reports
		ReporteVentas ventas = new ReporteVentas();
		ReporteMensual mensual = new ReporteMensual();
		
		Reporte reporte = new ReporteVentas(); 
		
		// Articles
		Articulo art1 = new Articulo("Bolsa", "$36", "15 Unidades");
		Articulo art2 = new Articulo("Trapo", "$2", "25 Unidades");
		Articulo art3 = new Articulo("Bote", "$50", "10 Unidades");
		Articulo art4 = new Articulo("Libreta", "$25", "1 Unidades");
		
		// Adding Products
		// Ventas
		ventas.addArticulo(art1);
		ventas.addArticulo(art2);
		ventas.addArticulo(art3);
		ventas.addArticulo(art4);
		
		// Mensual
		mensual.addArticulo(art1);
		mensual.addArticulo(art2);
		
		// Reporte 1 Add Behavior
		reporte.setExportBehavior(new XML());
		// Reporte 1 Add Articulos
		reporte.performExport();
		
		
		// Export Behavior
		ventas.printReporte();
		mensual.printReporte();
		
	}
	
}
