package headfirst.decorator.starbuzz;

/**
 * Coffee calculations with style using Decorator Design Pattern.
 * 
 * 
 * @author	Andrey Esaulov
 * @version 0.1
 * @changed Jan 8, 2013
 */
public class StarbuzzCoffee {
	
	public static void main(String[] args) {
		Beverage espresso = new Espresso();
		System.out.println(espresso.getDescription() + " $" + espresso.cost());
		
		// Fill with our house blend coffee
		Beverage houseBlend = new HouseBlend();
		// Add some milk
		houseBlend = new SteamedMilk(houseBlend);
		// And some whip
		houseBlend = new Whip(houseBlend);
		// Voila!
		System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
	}

}
