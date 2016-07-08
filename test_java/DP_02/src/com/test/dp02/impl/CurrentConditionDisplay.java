package com.test.dp02.impl;

import com.test.dp02.DisplayElement;
import com.test.dp02.Observer;
import com.test.dp02.Subject;

public class CurrentConditionDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrentConditionDisplay (Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current conditions: " + temperature 
				+ "F degree and " + humidity + "% humidity");
	}
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature = temp;
		this.humidity = humidity;
		display ();
	}
	
	
	
	
}