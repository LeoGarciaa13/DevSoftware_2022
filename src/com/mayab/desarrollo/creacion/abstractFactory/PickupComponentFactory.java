package com.mayab.desarrollo.creacion.abstractFactory;

public class PickupComponentFactory implements AutoComponentFactory{
	
	public Stereo buildStereo() {
		return new RoughUseStereo(); 
	}
	
	public Speaker buildSpeaker() {
		return new RoughUseSpeaker(); 
	}

}
