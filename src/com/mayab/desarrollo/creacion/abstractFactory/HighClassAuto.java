package com.mayab.desarrollo.creacion.abstractFactory;

public class HighClassAuto extends Auto {
	AutoComponentFactory compFactory;
	
	public HighClassAuto(AutoComponentFactory compFactory) {
		this.compFactory = compFactory;
	}
	
	void ensambleComponents() {
		System.out.println("Building " + model);
		stereo = compFactory.buildStereo();
		speaker = compFactory.buildSpeaker();
	}

}
