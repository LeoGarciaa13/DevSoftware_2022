package com.mayab.desarrollo.parcial1.problema3;

public class HighPressureGasBatch extends GasBatch{

	@Override
	public void InitialParamsBatch() {
		// Getting Initial Parameters of the batch
		System.out.println("------ High Pressure Gas Batch ------");
		System.out.println("Prime matter is been converted into gas...");
		System.out.println("Parameters measured:");
		System.out.println("- Pump Use");
		System.out.println("- Hours Used");
		System.out.println("- Prime matter level");
		
		
	}
	
	@Override
	public void FinalParams() {
		// Getting final parameters of the batch
		System.out.println("\ninal Parameters measured:");
		System.out.println("- Prime matter level");
		System.out.println("- Temperature of the batch");
		System.out.println("- Pressure");
		
	}

	@Override
	public void EnvasedVol() {
		// Calculating the bottling volume of the batch 
		System.out.println("\nCalculating volume of the batch...");
		System.out.println("Using the company provieded formula..");
		
	}

	@Override
	public void SecurityCheck() {
		// Making a security check
		System.out.println("\nCompleting the checklist provieded by the security guard...");
		
	}

}
