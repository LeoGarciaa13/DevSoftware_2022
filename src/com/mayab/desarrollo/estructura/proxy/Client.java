package com.mayab.desarrollo.estructura.proxy;

public class Client {
	public static void main(String[] args) {
		final IReporte rep1 = new ReporteVentasProxy();
		final IReporte rep2 = new ReporteVentasProxy();
		
		Empleado emp1 = new Empleado("Leo Garcia", "Administrador");
		Empleado emp2 = new Empleado("Leo G", "Vendedor");
		
		
		// First Report
		System.out.println("-----------------------------");
		System.out.println("--- Reporte 1 ---------------");
		rep1.leer(emp1);
		rep1.escribir(emp1, "Admin en accion ");
		System.out.println("\n");
		
		// First Report
		System.out.println("-----------------------------");
		System.out.println("--- Reporte 2 ---------------");
		rep2.leer(emp2);
		rep2.escribir(emp2, "Vendedor en accion ");
		System.out.println("\n");
	}

}
