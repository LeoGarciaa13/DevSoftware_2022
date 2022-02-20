package com.mayab.desarrollo.estructura.proxy;

public class Empleado {
	
	boolean r;
	boolean w; 
	String type;
	String name;
	
	public Empleado(String name, String type) {
		this.type = type; 
		this.name = name; 
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isR() {
		return r;
	}
	public void setR(boolean r) {
		this.r = r;
	}
	public boolean isW() {
		return w;
	}
	public void setW(boolean w) {
		this.w = w;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	} 
	
	

}
