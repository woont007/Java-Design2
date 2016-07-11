package com.test.dp03.impl;

import com.test.dp03.Beverage;
import com.test.dp03.CondimentDecorator;

public class Soy extends CondimentDecorator {

	Beverage beverage;
	
	public Soy (Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		//return beverage.cost() + .10;
		double cost = beverage.cost();
		
		if (beverage.getSize() == Size.TALL) {
			cost += .10;
		} else if (beverage.getSize() == Size.GRANDE) {
			cost += .15;
		} else if (beverage.getSize() == Size.VENTI) {
			cost += .20;
		}
		
		return cost;
		
	}
	
	
}