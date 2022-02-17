package com.mayab.desarrollo.comportamiento.strategy;

public class Articulo {
	
	public String nombre;
	public String costo;
	public String cantidad;
	
	public Articulo(String nom, String costo, String cant) {
		this.nombre = nom;
		this.costo = costo; 
		this.cantidad = cant;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCosto() {
		return costo;
	}

	public void setCosto(String costo) {
		this.costo = costo;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	
	
	

}
