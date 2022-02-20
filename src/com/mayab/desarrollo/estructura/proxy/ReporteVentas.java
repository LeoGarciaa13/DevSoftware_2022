package com.mayab.desarrollo.estructura.proxy;

public class ReporteVentas implements IReporte{

	@Override
	public void leer(Empleado emp) {
		System.out.println(emp.getName() +" leyendo informacion..");
		
	}

	@Override
	public void escribir(Empleado emp, String texto) {
		System.out.println(emp.getName() + " escribiendo datos.." + texto);
		
	}
	
}
