package headfirst.iterator;

public class Waitress {

	PancakeHouseMenu pancakeHouseMenu;
	
	public Waitress(PancakeHouseMenu pancackeMouseMenu) {
		this.pancakeHouseMenu = pancackeMouseMenu;
	}
	
	public void printMenu() {
		System.out.println("MENU\n-----\nPANCAKES\n");
		for (int i = 0; i < pancakeHouseMenu.getMenuItems().size(); i++) {
			MenuItem menuItem = (MenuItem)pancakeHouseMenu.getMenuItems().get(i);
			System.out.print(menuItem.getName() + " ");
			System.out.println(menuItem.getDescription() + " ");
			System.out.println(menuItem.getPrice() + " ");
		}
	}
	
	
	
}
