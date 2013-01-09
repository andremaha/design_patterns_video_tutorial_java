/**
 * 
 */
package headfirst.factory.pizzaaf;

/**
 * Concrete representation of the Pizza class - this is the pizza with lots of cheese.
 * What kind of cheese? Well that decides the IngredientFactory
 * 
 * @author	Andrey Esaulov
 * @version 0.1
 * @changed Jan 9, 2013
 */
public class VeggiePizza extends Pizza {

	PizzaIngredientFactory ingredientFactory;
	
	public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	
	void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		System.out.println("Mixing some " + dough.getName() + " dough");
		sause = ingredientFactory.createSause();
		System.out.println("Adding some " + sause.getName() + " sause");
		cheese = ingredientFactory.createCheese();
		System.out.println("Spicing up with some " + cheese.getName() + " cheese");
		veggies = ingredientFactory.createVeggies();
		System.out.println("Adding some veggies on the top");
		for (int i = 0; i < veggies.length; i++) {
			System.out.println(i + 1 + ") " + veggies[i].getName());
		}
	}

}
