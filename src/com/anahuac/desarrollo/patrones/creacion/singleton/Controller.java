package com.anahuac.desarrollo.patrones.creacion.singleton;
// Main Class Controller that calls the Singleton

public class Controller {

	public static void main(String[] args) {
		Horario horario = Horario.getInstance();
		horario.agregarClase(null, null);

	}

}
