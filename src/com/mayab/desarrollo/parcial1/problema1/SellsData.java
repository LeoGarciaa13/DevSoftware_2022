package com.mayab.desarrollo.parcial1.problema1;

import java.util.*;

import com.mayab.desarrollo.comportamiento.observer.Observer;

public class SellsData implements ISubject {
	private ArrayList observers; 
	private String message;
	private String time;
	private double messagePrice;
	private String companyStatus;  
	
	public SellsData(){
		observers = new ArrayList();
		
	}
	
	// IMPLEMENTED INTERFACE METHODS
	@Override
	public void registerObserver(IObserver o) {
		// Add a observer object to the array list
		observers.add(o);
	}

	@Override
	public void removeObserver(IObserver o) {
		// Gets the index of an observer object for delete
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
		
	}

	@Override
	public void notifyObservers() {
		// Send the notify for the role assigned
		for (int i = 0; i < observers.size(); i++) {
			IObserver observer = (IObserver)observers.get(i);
			observer.update(message, time, messagePrice, companyStatus);
		}
		
	}
	
	// FUNCTION METHODS 
	public void wait(int sec) {
		 try {
			 Thread.currentThread().sleep(sec * 1000);
		 } catch (InterruptedException e) {
			 e.printStackTrace();
		 }
	 }
	
	public void messageCounterStatusChanged() {
		notifyObservers();
	}
	
	public void prepareEmail() {
		System.out.println("Generating Email....");
		System.out.println("Sending Notifications by Email....");
		wait(2);
		
	}
	
	public void prepareTextMessage() {
		System.out.println("Generating Text Message....");
		System.out.println("Sending Notifications by Text Message....");
		wait(2);
		
	}
	
	public void setMessageInfo(String message, String time, double messagePrice, String companyStatus) {
		this.message = message;
		this.time = time;
		this.messagePrice = messagePrice;
		this.companyStatus = companyStatus; 
		messageCounterStatusChanged();
	}
	
	// GETTERS 

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * @return the messagePrice
	 */
	public double getMessagePrice() {
		return messagePrice;
	}
	/**
	 * @return the messageCounter
	 */
	public String getCompanyStatus() {
		return companyStatus;
	}
	

	
	
	
	

}
