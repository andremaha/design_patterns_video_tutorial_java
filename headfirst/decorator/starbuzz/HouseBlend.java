package headfirst.decorator.starbuzz;

/**
 * Represents a concrete Component of the Decorator Design Pattern.
 * 
 * 
 * @author	Andrey Esaulov
 * @version 0.1
 * @changed Jan 8, 2013
 */
public class HouseBlend extends Beverage {

	public HouseBlend() {
		description = "House Blend";
	}
	
	public double cost() {
		return .89;
	}

}
