package headfirst.observer.weather;
/**
 * Show the current coditions when those get changed in the WeatherData. 
 * 
 * @author	Andrey Esaulov
 * @version 0.1
 * @changed Jan 7, 2013
 */
public class IphoneDisplay implements Observer, DisplayElement {

	private double temperature;
	private double humidity;
	private float pressure;
	private Subject weatherData;
	
	
	public IphoneDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void display() {
		System.out.println("*** FANCY IPHONE DISPLAY ***");
		System.out.println(temperature
				+ "C degrees | " + humidity + "% humdity | " + pressure + " pressure");
		System.out.println("****************************");
	}

	public void update(double temp, double humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}
