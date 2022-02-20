package com.mayab.desarrollo.estructura.proxy;

public class ReporteVentasProxy implements IReporte{
	IReporte reporte = new ReporteVentas();
	
	@Override
	public void leer(Empleado emp) {
		reporte.leer(emp);
	}

	@Override
	public void escribir(Empleado emp, String texto) {
		if(emp.getType() == "Administrador") {
			reporte.escribir(emp, texto);
		}else {
			reporte.escribir(emp, "Sin permisos");
		}
		
	}
	

}
