package headfirst.factory.pizza;

/**
 * Abstract Method Factory
 * 
 * 
 * @author	Andrey Esaulov
 * @version 0.1
 * @changed Jan 8, 2013
 */
public abstract class PizzaStore {

	public Pizza orderPizza(String type) {
		
		Pizza pizza;
		
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
		
	}
	
	abstract Pizza createPizza(String type);
	
}
