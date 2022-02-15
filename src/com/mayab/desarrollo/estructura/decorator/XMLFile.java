package com.mayab.desarrollo.estructura.decorator;

public class XMLFile extends File{
	public XMLFile() {
		fileExtension = "XML File (.xml)";
	}
	
	public double size() {
		return 2.5;
	}
	
	public String write() {
		return "XML File has been written";
	}
	
	public String read() {
		return "XML File has been readed";
	}

}
