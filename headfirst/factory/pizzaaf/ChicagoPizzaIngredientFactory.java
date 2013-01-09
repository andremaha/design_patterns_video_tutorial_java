package headfirst.factory.pizzaaf;

/**
 * Special New York ingredients
 * 
 * @author	Andrey Esaulov
 * @version 0.1
 * @changed Jan 9, 2013
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ThickCrustDough();
	}
	
	public Sause createSause() {
		return new PlumTomatoSause();
	}
	
	public Cheese createCheese() {
		return new Mozzarella();
	}
	
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new EggPlant(), new Spinach(), new BlackOlives(), new RedPepper() };
		return veggies;
	}
	
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}
	
	public Clams createClam() {
		return new FrozenClams();
	}
}
