package headfirst.decorator.starbuzz;

/**
 * Concrete Decorator for Soy Milk type condiment.
 * 
 * 
 * @author	Andrey Esaulov
 * @version 0.1
 * @changed Jan 8, 2013
 */
public class Soy extends CondimentDecorator {

	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Soy Milk";
	}

	public double cost() {
		return .15 + beverage.cost();
	}

}
