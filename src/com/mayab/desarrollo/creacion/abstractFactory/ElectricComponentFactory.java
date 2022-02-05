package com.mayab.desarrollo.creacion.abstractFactory;

public class ElectricComponentFactory  implements AutoComponentFactory{
	
	public Stereo buildStereo() {
		return new HighClassStereo(); 
	}
	
	public Speaker buildSpeaker() {
		return new HighClassSpeaker(); 
	}

}
