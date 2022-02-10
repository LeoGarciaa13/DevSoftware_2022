package com.mayab.desarrollo.comportamiento.observer;

public class FlightScheadule {
	public static void main(String[] args) {
		FlightData flightData = new FlightData();
		AeropuertoDisplay currentDisplay = new AeropuertoDisplay(flightData);
		PasajeroDisplay statisticsDisplay = new PasajeroDisplay(flightData);
		CrewVueloDisplay forecastDisplay = new CrewVueloDisplay(flightData);
		
		// Flight 1
		flightData.bookFlight();
		flightData.setFlight("Madrid-CDMX", "13;45 hrs", "On Time", "08/02/2022", "13");
		// Flight 2
		flightData.bookFlight();
		flightData.setFlight("Milan-Berlin", "08;00 hrs", "Delayed", "08/02/2022", "03");
		// Flight 3
		flightData.bookFlight();
		flightData.setFlight("New York- Chicago", "16;30 hrs", "Cancelled", "08/02/2022", "15");
	}
}
