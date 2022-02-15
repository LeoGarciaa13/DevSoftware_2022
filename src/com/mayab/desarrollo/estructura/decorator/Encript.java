package com.mayab.desarrollo.estructura.decorator;

public class Encript extends FileFuntionsDecorator {
	File file; 
	
	public Encript(File file) {
		this.file = file; 
	}
	
	public String getFileExtension() {
		return "Encript/" + file.getFileExtension();
	}
	
	public double size() {
		return .75 + file.size();
	}
	
	public String write() {
		return file.write() + ", and encripted for security purposes";
	}
	
	public String read() {
		return file.read()  + ", processed for encription";
	}
}
