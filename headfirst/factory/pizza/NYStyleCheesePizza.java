package headfirst.factory.pizza;

/**
 * Pizza variant
 * 
 * @author	Andrey Esaulov
 * @version 0.1
 * @changed Jan 9, 2013
 */
public class NYStyleCheesePizza extends Pizza {

	public NYStyleCheesePizza() {
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sause = "Marinara Souse";
		
		toppings.add("Grated Reggiano Cheese");
	}
	
}
