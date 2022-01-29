package com.anahuac.desarrollo.patrones.creacion.singleton;
// Coordinador Class that implements action methods to the exercise given

public class Coordinador {
	
	private String carrera;
		
	public Coordinador(String c) {
		carrera = c; 
	}
	
	public void crearClase(String dia, String hora, String clase ) {
		Horario.getInstance().agregarClase(dia, hora, clase);
	}
	
	
	

}
