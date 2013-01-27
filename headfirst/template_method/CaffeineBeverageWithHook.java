package headfirst.template_method;

/**
 * The abstract class implementing Template Method Design pattern.
 * Template Method in this particular case s prepareRecipe() and it includes the following algorithm:
 * - boilWater()
 * - brew()
 * - pourInCup()
 * - addCondiments()
 * 
 * @author	Andrey Esaulov
 * @version 0.1
 * @changed Jan 27, 2013
 */

public abstract class CaffeineBeverageWithHook {

	/**
	 * Generalizes the preparation of a recipe and even adds a hook 
	 * customerWantsCondiments() which we can override (or not) in our
	 * implementations.
	 */
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}
	
	abstract void brew();
	abstract void addCondiments();
	
	void boilWater() {
		System.out.println("Boiling water");
	}
	
	void pourInCup() {
		System.out.println("Pouring into cup");
	}
	
	boolean customerWantsCondiments() {
		return true;
	}
 	
}
