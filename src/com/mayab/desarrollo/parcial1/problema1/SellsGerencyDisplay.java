package com.mayab.desarrollo.parcial1.problema1;

/*
 * 
 * IMPLEMENTACION DE PATRON OBSERVER
 * PROBLEMA 1
 * LEONARDO GARCIA
 * 
 */

public class SellsGerencyDisplay implements IObserver, IDisplayElement{
	private String message;
	private String time;
	private double messagePrice;
	private String companyStatus; 
	private ISubject sellsData; 
	
	public SellsGerencyDisplay(SellsData sellsData) {
		this.sellsData = sellsData;
		sellsData.registerObserver(this);
	}

	// IMPLEMENTED INTERFACE METHODS
	@Override
	public void update(String message, String time, double messagePrice , String companyStatus) {
		this.message = message;
		this.time = time;
		this.messagePrice = messagePrice;
		this.companyStatus = companyStatus;
		display();
		
	}
	
	@Override
	public void display() {
		if(messagePrice >= 3.5) {
			// Show notification message
			System.out.println("---------------------\n");
			System.out.println("Sells Gerency");
			System.out.println("-----Message Status----\n" 
								+"Sending stopped due message price\n");
			System.out.println("---------------------\n");
			
		}
		else if(companyStatus == "Cancelled"){
			// Show notification message
			System.out.println("---------------------\n");
			System.out.println("Sells Gerency");
			System.out.println("-----Message Status----\n" 
								+"Sending stopped due company Status\n");
			System.out.println("---------------------\n");
		}else {
			// Show notification message
			System.out.println("---------------------\n");
			System.out.println("Sells Gerency");
			System.out.println("-----Message Status----\n" 
								+"Content: "+ message + "\n" 
								+"Time: "+ time + "\n" 
								+"Price: "+ messagePrice + "\n");
			System.out.println("---------------------\n");
		}
		
		
	}
	

}
