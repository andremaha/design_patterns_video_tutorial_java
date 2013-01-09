package headfirst.factory.pizza;

/**
 * Pizza variant
 * 
 * @author	Andrey Esaulov
 * @version 0.1
 * @changed Jan 9, 2013
 */
public class NYStyleClamPizza extends Pizza {

	public NYStyleClamPizza() {
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sause = "Marinara Souse";
		
		toppings.add("Grated Reggiano Cheese");
	}
	
}
