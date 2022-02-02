package com.mayab.desarrollo.creacion.singleton;
// Main Class Controller that calls the Singleton

public class Controller {

	public static void main(String[] args) {
		Coordinador c1 = new Coordinador("Ing. Informatica");
		Coordinador c2 = new Coordinador("Ing. Civil");
		Coordinador c3 = new Coordinador("Ing. Animacion");
		
		c1.crearClase("Lunes", "5", "Estructura de Datos");
		c2.crearClase("Lunes", "3", "Topologia");
		c3.crearClase("Lunes", "6", "Realidad Virtual");
		
		Horario.getInstance().mostrarHorario();

	}

}
