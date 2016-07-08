package com.test.dp02.impl;

import java.util.ArrayList;

import com.test.dp02.Observer;
import com.test.dp02.Subject;

//WeatherData now implements the subject interface
public class WeatherData implements Subject { 
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData () {
		observers = new ArrayList<Observer> (); // To hold the Observers
	}

	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
		
	}

	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}		
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		
		measurementsChanged();		
	}
	
	// other WeatherData methods here
	
}