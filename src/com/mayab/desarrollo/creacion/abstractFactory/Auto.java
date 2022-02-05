package com.mayab.desarrollo.creacion.abstractFactory;

public abstract class Auto {
	String model;
	
	// Components
	Speaker speaker;
	Stereo stereo; 
	
	abstract void ensambleComponents();
	
	void paint() {
		System.out.println("The car is been painted");
	}
	
	void builded() {
		System.out.println("The car is been builded");
	}
	
	void QAcar() {
		System.out.println("The car is been tested");
	}
	
	void setModel(String model) {
		this.model = model; 
		
	}
	
	public String getModel(){
		return model; 
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("---- "+ model +"-----\n");
		if(speaker != null) {
			result.append(speaker);
			result.append("\n");
		}
		if(stereo != null) {
			result.append(stereo);
			result.append("\n");
		}
		return result.toString();
	}

}
