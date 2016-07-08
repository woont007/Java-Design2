package com.test.dp02;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();	// This method is called to notify all observers 
									// when the subject's state has changed.
}