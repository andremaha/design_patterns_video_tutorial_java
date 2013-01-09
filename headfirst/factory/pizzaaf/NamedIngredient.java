package headfirst.factory.pizzaaf;

/**
 * Represents a common algorithm to set and get the name of an igrediment, so when Pizza is put toghether one could see
 * what gets in the processes.
 * 
 * 
 * @author	Andrey Esaulov
 * @version 0.1
 * @changed Jan 9, 2013
 */
public abstract class NamedIngredient {

	String name = "Unknown Ingredient";
	
	public String getName() {
		return name;
	}
	
}
