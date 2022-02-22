package com.mayab.desarrollo.parcial1.problema3;

/*
 * 
 * IMPLEMENTACION DE PATRON TEMPLATE
 * PROBLEMA 3
 * LEONARDO GARCIA
 * 
 */

public class BatchDriverManager {

	public static void main(String[] args) {
		// MAIN BLOCK
		GasBatch liquidGas = new LiquidGasBatch();
		GasBatch highPressureGas = new HighPressureGasBatch();
		GasBatch acetyleneGas = new AcetyleneBatch(); 
		
		System.out.println("-----------------------------------");
		System.out.println("First Batch");
		liquidGas.fillGasBatch();
		System.out.println("-----------------------------------");
		System.out.println("Second Batch");
		highPressureGas.fillGasBatch();
		System.out.println("-----------------------------------");
		System.out.println("Third Batch");
		acetyleneGas.fillGasBatch();



	}

}
