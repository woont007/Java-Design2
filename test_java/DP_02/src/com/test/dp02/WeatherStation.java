package com.test.dp02;

import com.test.dp02.impl.CurrentConditionDisplay;
import com.test.dp02.impl.WeatherData;

public class WeatherStation {
	
	public static void main (String[] args) {
		WeatherData weatherData = new WeatherData(); 
		
		CurrentConditionDisplay currentDisplay = 
			new CurrentConditionDisplay (weatherData);
		
		weatherData.setMeasurements(80, 65, 39.4f);
		weatherData.setMeasurements(82, 70, 31.4f);
		weatherData.setMeasurements(78, 90, 29.2f);
		
	}
	
}