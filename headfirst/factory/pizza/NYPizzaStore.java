package headfirst.factory.pizza;

/**
 * Concrete representation of the Abstract Factory PizzaStore
 * 
 * 
 * @author	Andrey Esaulov
 * @version 0.1
 * @changed Jan 8, 2013
 */
public class NYPizzaStore extends PizzaStore {

	public Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else return null;
	}
	
}
