package headfirst.template_method;

/**
 * Tests our classes that use Template Method Design Pattern
 * 
 * 
 * @author	Andrey Esaulov
 * @version 0.1
 * @changed Jan 27, 2013
 */

public class BeverageTestDrive {

	public static void main(String[] args) {
		
		TeaWithHook teaHook = new TeaWithHook();
		CoffeeWithHook coffeeHook = new CoffeeWithHook();
		
		System.out.println("\n Making tea");
		teaHook.prepareRecipe();
		
		System.out.println("\n Making coffee");
		coffeeHook.prepareRecipe();
		
	}
	
}
