package com.mayab.desarrollo.parcial1.problema3;

public class LiquidGasBatch extends GasBatch{

	@Override
	public void InitialParamsBatch() {
		// Getting Initial Parameters of the batch
		System.out.println("------ Liquid Gas Batch ------");
		System.out.println("Prime matter taken while is liquid...");
		System.out.println("Parameters measured:");
		System.out.println("- Prime matter level");
		
		
	}
	
	@Override
	public void FinalParams() {
		// Getting final parameters of the batch
		System.out.println("\nFinal Parameters measured:");
		System.out.println("- Prime matter level");
		
	}

	@Override
	public void EnvasedVol() {
		// Calculating the bottling volume of the batch 
		System.out.println("\nCalculating volume of the batch...");
		System.out.println("Initial prime matter minus final prime matter..");
		
	}

	@Override
	public void SecurityCheck() {
		// Making a security check
		System.out.println("\nLess hard test...");
		System.out.println("Completing the checklist provieded by the securyty guard...");
		
	}

}
