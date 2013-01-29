package headfirst.iterator;

public class Waitress {

	PancakeHouseMenu pancakeHouseMenu;
	DinerMenu dinerMenu;
	
	public Waitress(PancakeHouseMenu pancackeMouseMenu, DinerMenu dinerMenu) {
		this.pancakeHouseMenu = pancackeMouseMenu;
		this.dinerMenu = dinerMenu;
	}
	
	public void printMenu() {
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinnerIterator = dinerMenu.createIterator();
		
		System.out.println("MENU\n-----\nPANCAKES\n");
		printMenu(pancakeIterator);
		
		System.out.println("MENU\n-----\nDinner\n");
		printMenu(dinnerIterator);
		
	}
	
	private void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.println(menuItem.getName() + ", ");
			System.out.println(menuItem.getDescription() + " ");
			System.out.println(menuItem.getPrice() + " ");
		}
	}
	
	
	
}
