package headfirst.observer.weather;
/**
 * Defines the display method to be impemented by all the classes that are to 
 * display the WeatherStation data - current conditions, forecast, stats, custom iPhone display client.
 * 
 * @author 	Andrey Esaulov
 * @version 0.1
 * @changed	2013-01-07
 */
public interface DisplayElement {

	public void display();
	
}
