package headfirst.iterator;

import java.util.ArrayList;

/**
 * The Menu number one
 * 
 * 
 * @author	Andrey Esaulov
 * @version 0.1
 * @changed Jan 28, 2013
 */
public class PancakeHouseMenu {

	ArrayList menuItems;
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList();
		
		addItem("K&B's Pancake Breakfast", "Pancakes with scrambledeggs, and toast", false, 2.99);
		
		addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
		
		addItem("Blueberry Pancakes", "Pancakesmade with fresh blueberries", false, 3.49);
		
		addItem("Waffles", "Waffles,with your choice of blueberries or strawberries", true, 3.59);
		
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
		
	}
	
	public ArrayList getMenuItems() {
		return menuItems;
	}
	
}
