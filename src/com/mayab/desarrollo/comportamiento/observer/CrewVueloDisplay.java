package com.mayab.desarrollo.comportamiento.observer;

public class CrewVueloDisplay implements Observer, DisplayElement {
	private String fromTo;
	private String hora;
	private String status; 
	private String dia;
	private String puerta;
	private Subject flightData;
	
	public CrewVueloDisplay(FlightData flightData) {
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
		System.out.println("-----------------------------\n");
		System.out.println("Crew Vuelo Notification");
		System.out.println("-----Actual Crew Fligh for----\n" 
							+"From-To: "+ fromTo + "\n"
							+"Hour: "+ hora + "\n"
							+"Status :"+ status);
		System.out.println("------------------------------\n");
	}


}
