package headfirst.factory.pizzaaf;

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
		Pizza pizza = null;
		
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
		
		if (item.equals("cheese")) {
			
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Pizza Style Cheese Pizza");
			
		} else if (item.equals("veggie")) {
			
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Chicago Pizza Style Veggie Pizza");
			
		} else if (item.equals("clam")) {
			
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Pizza Style Clam Pizza");
			
		} else if (item.equals("pepperoni")) {
			
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Chicago Pizza Style Pepperoni Pizza");
			
		}
		
		return pizza;
	}
	
}
