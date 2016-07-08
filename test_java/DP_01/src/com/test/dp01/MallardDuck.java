package com.test.dp01;

import com.test.dp01.impl.FlyWithWings;
import com.test.dp01.impl.Quack;

public class MallardDuck extends Duck {
	public MallardDuck () {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println ("I am a real Mallard duck");
	}
}