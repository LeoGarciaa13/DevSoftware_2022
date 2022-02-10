package com.mayab.desarrollo.comportamiento.observer;

import java.util.*;

public class FlightData implements Subject{
	private ArrayList observers; 
	private String fromTo;
	private String hora;
	private String status; 
	private String dia;
	private String puerta;
	
	public FlightData() {
		observers = new ArrayList();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(fromTo, hora, status, dia, puerta);
		}
	}
	
	public void wait(int sec) {
		 try {
			 Thread.currentThread().sleep(sec * 1000);
		 } catch (InterruptedException e) {
			 e.printStackTrace();
		 }
	 }
	
	
	public void flightStatusChanged() {
		notifyObservers();
	}
	
	public void bookFlight() {
		System.out.println("Flight Booked....");
		System.out.println("Sending Notifications....");
		wait(2);
		
	}
	
	public void setFlight(String fromTo, String hora, String status, String dia, String puerta) {
		this.fromTo = fromTo;
		this.hora = hora;
		this.status = status;
		this.dia = dia;
		this.puerta = puerta;
		flightStatusChanged();
	}
	
	// GETTERS 
	
	public String getFromTo() {
		return fromTo;
	}
	
	public String getHora() {
		return hora;
	}
	
	public String getStatus() {
		return status;
	}
	
	public String getDia() {
		return dia;
	}
	
	public String getPuerta() {
		return puerta;
	}
	
	
	
	
	
}
