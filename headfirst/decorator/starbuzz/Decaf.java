package headfirst.decorator.starbuzz;

/**
 * Represents a concrete Component of the Decorator Design Pattern.
 * 
 * 
 * @author	Andrey Esaulov
 * @version 0.1
 * @changed Jan 8, 2013
 */
public class Decaf extends Beverage {

	public Decaf() {
		description = "Decaf";
	}
	
	public double cost() {
		return 1.05;
	}

}
