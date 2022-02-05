package com.mayab.desarrollo.creacion.abstractFactory;

public class CommonClassAuto extends Auto{
	AutoComponentFactory compFactory;
	
	public CommonClassAuto(AutoComponentFactory compFactory) {
		this.compFactory = compFactory;
	}
	
	void ensambleComponents() {
		System.out.println("Building " + model);
		stereo = compFactory.buildStereo();
		speaker = compFactory.buildSpeaker();
	}
	

}
