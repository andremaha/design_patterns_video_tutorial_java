package headfirst.factory.pizza;

/**
 * Chicago Pizza variant that overrides the cutting method of the abstract Pizza class
 * 
 * @author	Andrey Esaulov
 * @version 0.1
 * @changed Jan 9, 2013
 */
public class ChicagoStyleClamPizza extends Pizza {

	public ChicagoStyleClamPizza() {
		name = "Chicago Style Clam Pizza";
		dough = "Extra Thick Crust Dough";
		sause = "Plum Tomato Souse";
		
		toppings.add("Clam");
	}
	
	void cut() {
		System.out.println("Cutting the pizza into square clices");
	}
	
}
