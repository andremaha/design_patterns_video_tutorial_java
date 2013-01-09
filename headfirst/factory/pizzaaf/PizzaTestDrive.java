package headfirst.factory.pizzaaf;

/**
 * Tests different Pizza Factories in Town and drives them around.
 * 
 * 
 * @author	Andrey Esaulov
 * @version 0.2
 * @changed Jan 9, 2013
 */
public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Andrey ordered a " + pizza.getName() + "\n");
		
		pizza = chicagoStore.orderPizza("veggie");
		System.out.println("Veronika ordered a " + pizza.getName() + "\n");
		
	}

}
