package com.test.dp03;

import com.test.dp03.impl.DarkRoast;
import com.test.dp03.impl.Espresso;
import com.test.dp03.impl.HouseBlend;
import com.test.dp03.impl.Mocha;
import com.test.dp03.impl.Soy;
import com.test.dp03.impl.Whip;

public class StarbuzzCoffee {
	
	public static void main (String args[]) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2); // Wrap it with a Mocha.
		beverage2 = new Mocha(beverage2); // Wrap it in a second Mocha.
		beverage2 = new Whip (beverage2);	  // Wrap it in a whip.
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
	}
	
}