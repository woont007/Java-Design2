package com.test.dp03;

public abstract class CondimentDecorator extends Beverage {
	
	public Beverage beverage;
	
	public abstract String getDescription ();
	// We are also going to require that the condiment decorators all reimplement the
	// getDescription() method.
	
	public Size getSize() {
		return beverage.getSize();
	}
	
}