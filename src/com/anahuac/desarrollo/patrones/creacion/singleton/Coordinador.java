package com.anahuac.desarrollo.patrones.creacion.singleton;
// Coordinador Class that implements action methods to the exercise given

public class Coordinador {
	
	// Coordinaodr methods to interact with Horario
	boolean classGenerated = false; 
	
	public boolean crearClase() {
		boolean classGenerated = true;
		return classGenerated; 
	}
	
	public boolean verificarHoario() {
		boolean flag = false;
		if(classGenerated == true){
			System.out.println("Clase Verificada");
			flag = true;
		}else {
			System.out.println("Fallo en verificacion");
			flag = false;
		}
		return flag; 
	}
	
	

}
