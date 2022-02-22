package com.mayab.desarrollo.parcial1.problema4;

/*
 * 
 * IMPLEMENTACION DE PATRON ADAPTER
 * PROBLEMA 4 
 * LEONARDO GARCIA
 * 
 */

public class DataBaseTestDrive {

	public static void main(String[] args) {
		// DataBase A
		DataBaseA dbA = new DataBaseA("conexion exitosa..", "TABLA", "COLUMNA", "sentencia exitosa...");
		// Adapter DataBase A
		IDataBase dbAtodb = new AdapterDataBaseA(dbA);
		// DataBase A
		DataBaseB dbB = new DataBaseB("conexion exitosa..", "tabla", "columna", "sentencia exitosa...");
		// Adapter DataBase A
		IDataBase dbBtodb = new AdapterDataBaseB(dbB);
		// DataBase A
		DataBaseC dbC = new DataBaseC("conexion exitosa..", "TaBlA", "cOlUmNa", "sentencia exitosa...");
		// Adapter DataBase A
		IDataBase dbCtodb = new AdapterDataBaseC(dbC);
		
		System.out.println("----------------------------------------");
		System.out.println("Inicio de proceso de guardado de informacion..");
		System.out.println("Conexion: " + dbAtodb.getConnection());
		System.out.println("Sentencia: " + dbAtodb.createStatement());
		System.out.println("Resultado: " + dbAtodb.executeStatement());
		
		System.out.println("----------------------------------------");
		System.out.println("Inicio de proceso de guardado de informacion..");
		System.out.println("Conexion: " + dbBtodb.getConnection());
		System.out.println("Sentencia: " + dbBtodb.createStatement());
		System.out.println("Resultado: " + dbBtodb.executeStatement());

		System.out.println("----------------------------------------");
		System.out.println("Inicio de proceso de guardado de informacion..");
		System.out.println("Conexion: " + dbCtodb.getConnection());
		System.out.println("Sentencia: " + dbCtodb.createStatement());
		System.out.println("Resultado: " + dbCtodb.executeStatement());

	}

}
