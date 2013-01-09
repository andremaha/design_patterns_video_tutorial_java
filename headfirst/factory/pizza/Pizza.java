package headfirst.factory.pizza;
import java.util.ArrayList;

/**
 * Abstract representation of the Pizza type. 
 * Every Pizza should be prepared, baked, cut and finally boxed. This is the home recipie and every concrete 
 * pizza should follow these steps, although the different style pizzas override the details in their implementation.
 * 
 * @author	Andrey Esaulov
 * @version 0.1
 * @changed Jan 9, 2013
 */
public abstract class Pizza {

	String name;
	String dough;
	String sause;
	ArrayList toppings = new ArrayList();
	
	void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding souse...");
		System.out.println("Adding toppings: ");
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println("\t" + toppings.get(i));
		}
	}
	
	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	public String getName() {
		return name;
	}
	
}
