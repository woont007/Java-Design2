package com.test.dp03.impl;

import com.test.dp03.Beverage;
import com.test.dp03.CondimentDecorator;

public class Mocha extends CondimentDecorator {

	Beverage beverage;
	
	public Mocha (Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Mocah";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost() + .20;
	}
	
	
}