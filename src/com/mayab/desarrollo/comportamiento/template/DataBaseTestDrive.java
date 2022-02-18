package com.mayab.desarrollo.comportamiento.template;

public class DataBaseTestDrive {

	public static void main(String[] args) {
		
		Test create = new CreateTest();
		Test delete = new DeleteTest();
		Test retrieve = new RetrieveTest();
		Test update = new UpdateTest();
		
		System.out.println("\nPruebas de creacion...");
		create.executeTest();
		System.out.println("\n----------------------");
		create.executeTest();
		System.out.println("\n----------------------");
		System.out.println("\nPruebas de borrado...");
		delete.executeTest();
		System.out.println("\n----------------------");
		System.out.println("\nPruebas de obtencion de informacion...");
		retrieve.executeTest();
		System.out.println("\n----------------------");
		System.out.println("\nPruebas de actualizacion de informacion...");
		update.executeTest();
		System.out.println("\n----------------------");
		

	}

}
