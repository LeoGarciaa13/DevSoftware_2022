package com.mayab.desarrollo.parcial1.problema1;

public interface ISubject {
	public void registerObserver(IObserver o);
	public void removeObserver(IObserver o);
	public void notifyObservers();
	
}
