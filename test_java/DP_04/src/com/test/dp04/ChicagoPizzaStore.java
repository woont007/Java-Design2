package com.test.dp04;

public class ChicagoPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
        	if (item.equals("cheese")) {
            		return new ChicagoStyleCheesePizza();
        	} else if (item.equals("veggie")) {
        	    	return new ChicagoStyleVeggiePizza();
        	} else return null;
	}
}