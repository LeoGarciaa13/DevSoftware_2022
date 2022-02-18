package com.mayab.desarrollo.comportamiento.template;

public abstract class Test {
	
	final void executeTest() {
		setUp();
		run();
		verify();
		tearDown();
		
	}
	
	// ABSTRACT
	abstract void run();
	
	abstract void verify();
	
	// CONCREATE METHODS
	
	public void setUp() {
		System.out.println("Creando conexion a la base de datos...");
	}
	
	public void tearDown() {
		System.out.println("Cerrando conexion a la base de datos...");
	}

}
