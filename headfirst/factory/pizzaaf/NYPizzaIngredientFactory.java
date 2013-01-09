package headfirst.factory.pizzaaf;

/**
 * Special New York ingredients
 * 
 * @author	Andrey Esaulov
 * @version 0.1
 * @changed Jan 9, 2013
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ThinCrustDough();
	}
	
	public Sause createSause() {
		return new MarinaraSause();
	}
	
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
	
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}
	
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}
	
	public Clams createClam() {
		return new FreshClams();
	}
}
