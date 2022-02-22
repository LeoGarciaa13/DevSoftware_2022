package com.mayab.desarrollo.parcial1.problema1;

public class SellsReportSAGE {

	public static void main(String[] args) {
		// MAIN BLOCK 
		SellsData sells = new SellsData();
		SellsGerencyDisplay gerency = new SellsGerencyDisplay(sells);
		
		//Message 1
		System.out.println("Sending report as EMAIL..");
		sells.prepareEmail();
		sells.setMessageInfo("This is the content of message 1", "13:45", 2.5, "Aproved");
		//Message 2
		System.out.println("Sending report as TEXT..");
		sells.prepareTextMessage();
		sells.setMessageInfo("This is the content of message 2", "13:50", 3.3, "Aproved");
		//Message 3
		System.out.println("Sending report as TEXT..");
		sells.prepareTextMessage();
		sells.setMessageInfo("This is the content of message 3", "14:00", 3.6, "Aproved");
		//Message 4
		System.out.println("Sending report as EMAIL..");
		sells.prepareTextMessage();
		sells.setMessageInfo("This is the content of message 4", "13:50", 3.0, "Cancelled");
		
		

	}

}
