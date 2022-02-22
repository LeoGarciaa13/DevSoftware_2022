package com.mayab.desarrollo.parcial1.problema3;


public abstract class GasBatch {
	
	
	final void fillGasBatch() {
		InitialParamsBatch(); 
		FinalParams();
		EnvasedVol(); 
		SecurityCheck(); 
		PrintReport(); 
		
	}
	
	// ABSTRACT METHODS 
	public abstract void InitialParamsBatch(); 
	public abstract void FinalParams();
	public abstract void EnvasedVol(); 
	public abstract void SecurityCheck();
	
	// CONCRATE METHODS 
	
	public void PrintReport() {
		System.out.println("\nPrinting results with the pure gas standard...");
	}
}
