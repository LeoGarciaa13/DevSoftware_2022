package com.mayab.desarrollo.estructura.decorator;

public class Compress extends FileFuntionsDecorator {
	File file; 
	
	public Compress(File file) {
		this.file = file; 
	}
	
	public String getFileExtension() {
		return "Compressed/" + file.getFileExtension();
	}
	
	public double size() {
		return .5 + file.size();
	}
	
	public String write() {
		return file.write() + ", closed, and compressed";
	}
	
	public String read() {
		return file.read()  + ", opened and edited for foward compressed";
	}

}
