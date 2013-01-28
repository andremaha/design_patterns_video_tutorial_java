package headfirst.iterator;

/**
 * Let's test the waitress before hiring her full-time.
 * 
 * 
 * @author	Andrey Esaulov
 * @version 0.1
 * @changed Jan 28, 2013
 */
public class WaitressTrainingDay {

	public static void main(String args[]) {
		
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		
		Waitress waitress = new Waitress(pancakeHouseMenu);
		
		waitress.printMenu();
	}
	
}
