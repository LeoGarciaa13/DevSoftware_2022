package com.mayab.desarrollo.creacion.abstractFactory;

public class SedanComponentFactory implements AutoComponentFactory{
	
	public Stereo buildStereo() {
		return new CommonStereo(); 
	}
	
	public Speaker buildSpeaker() {
		return new CommonSpeaker(); 
	}

}
