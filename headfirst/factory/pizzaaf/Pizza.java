package headfirst.factory.pizzaaf;
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
	Dough dough;
	Sause sause;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
	
	abstract void prepare();
	
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
	
	void setName(String name) {
		this.name = name;
	}
	
	
	public String toString() {
		return name + " pizza";
	}
	
}
