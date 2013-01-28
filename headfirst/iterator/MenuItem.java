package headfirst.iterator;

/**
 * Each of the items in the menu should have a name, description, flag if it's vegetarian or not and the price
 * 
 * 
 * @author	Andrey Esaulov
 * @version 0.1
 * @changed Jan 28, 2013
 */
public class MenuItem {

	String name;
	String description;
	Boolean vegetarian;
	double price;
	
	public MenuItem(String name, String description, Boolean vegetarian, double price) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public Boolean isVegetarian() {
		return vegetarian;
	}
	
	public double getPrice() {
		return price;
	}
	
}
