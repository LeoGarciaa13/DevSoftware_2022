package com.mayab.desarrollo.comportamiento.observer;

public class AeropuertoDisplay implements Observer, DisplayElement{
	private String fromTo;
	private String hora;
	private String status; 
	private String dia;
	private String puerta;
	private Subject flightData;
	
	public AeropuertoDisplay(FlightData flightData) {
		this.flightData = flightData;
		flightData.registerObserver(this);
	}
	
	public void update(String fromTo, String hora, String status, String dia, String puerta) {
		this.fromTo = fromTo;
		this.hora = hora;
		this.status = status;
		this.dia = dia;
		this.puerta = puerta;
		display();
	}
	
	public void display() {
		System.out.println("---------------------\n");
		System.out.println("Airport Notification");
		System.out.println("-----Actual Flight----\n" 
							+"From-To: "+ fromTo + "\n" 
							+"Hour: "+ hora + "\n" 
							+"Status: "+ status + "\n" 
							+"Date: "+ dia + "\n" 
							+"Gate: "+ puerta + "\n");
		System.out.println("---------------------\n");
	}

}
