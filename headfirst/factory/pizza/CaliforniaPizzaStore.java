package headfirst.factory.pizza;

/**
 * Concrete representation of the Abstract Factory PizzaStore
 * 
 * 
 * @author	Andrey Esaulov
 * @version 0.1
 * @changed Jan 8, 2013
 */
public class CaliforniaPizzaStore extends PizzaStore {

	public Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new CaliforniaStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new CaliforniaStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new CaliforniaStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new CaliforniaStylePepperoniPizza();
		} else return null;
	}
	
}
