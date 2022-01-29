package com.anahuac.desarrollo.patrones.creacion.singleton;

import java.util.HashMap;
import java.util.Map;


// Class Horario - Implements Singleton

public class Horario {
	private static Horario uniqueInstance; 
	private HashMap<String, String> FakeDB;
	
	// PRivate Constructor for Singleton
	private Horario() {
		FakeDB = new HashMap<String, String> ();
	}
	
	// GetInstance method for the return statement for Singleton
	public static Horario getInstance() {
		if(uniqueInstance == null) {
			System.out.println("Creating unique instance of Horario");
			uniqueInstance = new Horario();
		}
		System.out.println("Returning instance of Horario");
		return uniqueInstance;
	}
	
	// AgregarClase Method for the Horario 
	public void agregarClase(String dia, String hora,String clase) {
		FakeDB.put(dia+"-"+hora, clase);
		System.out.println("Clase agregada con exito"); 
	}
	
	// Print the horario in the HashMap
	public void mostrarHorario() {
		for (Map.Entry entry : FakeDB.entrySet()) {
		    System.out.println("Horario: " + entry.getKey() + " Clase: " + entry.getValue());
		}
	}

}
