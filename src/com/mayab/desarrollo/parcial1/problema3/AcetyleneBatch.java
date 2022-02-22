package com.mayab.desarrollo.parcial1.problema3;

public class AcetyleneBatch extends GasBatch{

	@Override
	public void InitialParamsBatch() {
		// Getting Initial Parameters of the batch
		System.out.println("------ Acetylene Batch ------");
		System.out.println("Parameters measured:");
		System.out.println("- Number of Drums");
		System.out.println("- Prime matter level in drums");
		
		
	}
	
	@Override
	public void FinalParams() {
		// Getting final parameters of the batch
		System.out.println("\nFinal Parameters measured:");
		System.out.println("- Number of Drums");
		
	}

	@Override
	public void EnvasedVol() {
		// Calculating the bottling volume of the batch 
		System.out.println("\nCalculating volume of the batch...");
		System.out.println("Using the generency provieded special formula..");
		
	}

	@Override
	public void SecurityCheck() {
		// Making a security check
		System.out.println("\nVery hard test...");
		System.out.println("Completing the checklist provieded by the security guard...");
		
	}

}
