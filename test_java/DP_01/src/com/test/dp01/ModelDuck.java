package com.test.dp01;

import com.test.dp01.impl.FlyNoWay;
import com.test.dp01.impl.Quack;


public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am a model duck");
		
	}
	
	
}