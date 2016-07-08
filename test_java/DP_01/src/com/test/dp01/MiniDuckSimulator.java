package com.test.dp01;

import com.test.dp01.impl.FlyRocketPowered;

public class MiniDuckSimulator {
	public static void main (String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck  model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}