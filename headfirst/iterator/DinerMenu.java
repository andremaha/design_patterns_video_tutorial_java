package headfirst.iterator;

/**
 * This is the diner menu, using simple Array to hold the menu items.
 * 
 * 
 * @author	Andrey Esaulov
 * @version 0.1
 * @changed Jan 29, 2013
 */
public class DinerMenu {

	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public DinerMenu() {
		
		menuItems = new MenuItem[MAX_ITEMS];
		
		addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wehat", true, 2.99);
		
		addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
		
		addItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05);
		
		addItem("American Burger", "Beef and the classic american style burger", false, 2.99);
		
		addItem("Borsch", "Russian classic soup with meat", false, 3.99);
		
		addItem("Chicken Fries", "Kentucky chicken fried with potatos", false, 3.09);
		
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full! Can't add item to menu.");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}

	}

	public Iterator createIterator() {
		return new DinerMenuIterator(menuItems);
	}
}
