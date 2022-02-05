package com.mayab.desarrollo.creacion.abstractFactory;

public class RoughUseClassAuto extends Auto{
	AutoComponentFactory compFactory;
	
	public RoughUseClassAuto(AutoComponentFactory compFactory) {
		this.compFactory = compFactory;
	}
	
	void ensambleComponents() {
		System.out.println("Building " + model);
		stereo = compFactory.buildStereo();
		speaker = compFactory.buildSpeaker();
	}
	

}
