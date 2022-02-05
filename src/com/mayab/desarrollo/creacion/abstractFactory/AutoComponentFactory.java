package com.mayab.desarrollo.creacion.abstractFactory;
/*
 * Auto Component Interface (Factory Pattern) 
 */

public interface AutoComponentFactory {
	
	public Stereo buildStereo();
	public Speaker buildSpeaker();

}
