package headfirst.factory.pizza;

/**
 * Concrete representation of the Abstract Factory PizzaStore
 * 
 * 
 * @author	Andrey Esaulov
 * @version 0.1
 * @changed Jan 8, 2013
 */
public class ChicagoPizzaStore extends PizzaStore {

	public Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new ChicagoStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new ChicagoStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new ChicagoStylePepperoniPizza();
		} else return null;
	}
	
}
