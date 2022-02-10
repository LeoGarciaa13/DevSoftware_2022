package com.mayab.desarrollo.comportamiento.observer;

public class PasajeroDisplay  implements Observer, DisplayElement{
	private String fromTo;
	private String hora;
	private String status; 
	private String dia;
	private String puerta;
	private Subject flightData; 
	
	public PasajeroDisplay(FlightData flightData) {
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
		System.out.println("-----------------------\n");
		System.out.println("Pasanger Notification\n");
		if(this.status == "Cancelled") {
			System.out.println("Status: Cancelled\n");
			System.out.println("Please rebook your flight\n");
			System.out.println("-----------------------\n");
		}else {
			System.out.println(
					"From-To: " + this.fromTo + "\n" +
					"Hour: " + this.hora + "\n" +
					"Status: " + this.status + "\n" +
					"Date: " + this.dia + "\n" +
					"Gate: " + this.puerta + "\n");
			System.out.println("-----------------------\n");
		}
		
	}

}
