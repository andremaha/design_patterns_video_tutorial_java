package headfirst.factory.pizzaaf;

/**
 * Abstract Factory forming the base for the different ingredient variants. 
 * 
 * @author	Andrey Esaulov
 * @version 0.1
 * @changed Jan 9, 2013
 */
public interface PizzaIngredientFactory {

	public Dough createDough();
	public Sause createSause();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
	
}
