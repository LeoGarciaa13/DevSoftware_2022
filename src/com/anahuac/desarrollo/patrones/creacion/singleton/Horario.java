package com.anahuac.desarrollo.patrones.creacion.singleton;

import java.util.HashMap;


// Class Horario - Implements Singleton

public class Horario {
	private static Horario uniqueInstance; 
	HashMap<String, String> FakeDB;
	
	// PRivate Constructor for Singleton
	private Horario() {
		FakeDB = new HashMap<String, String> ();
	}
	
	// GetInstance method for the return statement for Singleton
	public static Horario getInstance() {
		if(uniqueInstance == null) {
			System.out.println("Craeting unique instance of Horario");
			uniqueInstance = new Horario();
		}
		System.out.println("Returning instance of Horario");
		return uniqueInstance;
	}
	
	// AgregarClase Method for the Horario 
	public void agregarClase(String value1, String value2) {
		FakeDB.put(value1, value2);
		System.out.println("Clase agregada con exito"); 
	}

}
