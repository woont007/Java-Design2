package com.test.dp04;

public class NYPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		// TODO Auto-generated method stub
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new NYStyleVeggiePizza();
		}
		else 	
			return null;
	}
	
	
}