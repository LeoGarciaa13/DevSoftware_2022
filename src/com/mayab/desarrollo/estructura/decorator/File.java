package com.mayab.desarrollo.estructura.decorator;

public abstract class File {
	
	String fileExtension = "Unkown File"; 
	
	public String getFileExtension() {
		return fileExtension; 
	}
	
	public abstract double size();
	public abstract String write();
	public abstract String read();

}
