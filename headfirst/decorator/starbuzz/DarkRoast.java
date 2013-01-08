package headfirst.decorator.starbuzz;

/**
 * Represents a concrete Component of the Decorator Design Pattern.
 * 
 * 
 * @author	Andrey Esaulov
 * @version 0.1
 * @changed Jan 8, 2013
 */
public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "Dark Roast";
	}
	
	public double cost() {
		return .99;
	}

}
