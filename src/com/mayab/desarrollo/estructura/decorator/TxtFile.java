package com.mayab.desarrollo.estructura.decorator;

public class TxtFile extends File {
	public TxtFile() {
		fileExtension = "Text File (.txt)";
	}
	
	public double size() {
		return 1.5;
	}
	
	public String write() {
		return "Txt File has been written";
	}
	
	public String read() {
		return "Txt File has been readed";
	}

}
