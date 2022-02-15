package com.mayab.desarrollo.estructura.decorator;

public class FileManagerDriver {

	public static void main(String[] args) {
		// MAIN
		// New file 1
		System.out.println("----------------------------------------------------------");
		File file = new TxtFile();
		System.out.println(file.getFileExtension() + " Size: " + file.size() + " MB\n" +
							file.read() + "\n" +  file.write() + "\n");
		
		// New File 2
		System.out.println("----------------------------------------------------------");
		File file2 = new XMLFile();
		file2 = new Compress(file2);
		file2 = new Encript(file2);
		System.out.println(file2.getFileExtension() + " Size: " + file2.size() + " MB\n" +
				file2.read() + "\n" +  file2.write() + "\n");
		
		// New file 3
		System.out.println("----------------------------------------------------------");
		File file3 = new XMLFile();
		file3 = new Encript(file3);
		file3 = new Compress(file3);
		file3 = new Compress(file3);
		System.out.println(file3.getFileExtension() + " Size: " + file3.size() + " MB\n" +
				file3.read() + "\n" +  file3.write() + "\n");
		
	}

}
