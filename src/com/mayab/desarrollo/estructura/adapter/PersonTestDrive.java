package com.mayab.desarrollo.estructura.adapter;

public class PersonTestDrive {

	public static void main(String[] args) {
		// Old Person to New Person
		OldPerson oldperson = new OldPerson("Leonardo","Garcia", "13/09/2001"); 
		
		INewPerson oldToNew = new AdapterOldPerson(oldperson);
		
		System.out.println("----------------------------------------");
		System.out.println("Informacion de la Nueva Persona");
		System.out.println("Nombre: " + oldToNew.getName() + "\n");
		System.out.println("Edad: " + oldToNew.getAge() + "\n");
		
	}

}
