package headfirst.observer.weather;
/**
 * Show the current coditions when those get changed in the WeatherData. 
 * 
 * @author	Andrey Esaulov
 * @version 0.1
 * @changed Jan 7, 2013
 */
public class ForecastDisplay implements Observer, DisplayElement {

	private double temperature;
	private double humidity;
	private float pressure;
	private Subject weatherData;
	
	
	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void display() {
		if (temperature > 0 && temperature < 5) {
			System.out.println("Mild weather next days");
		} else if (temperature > 5 && temperature < 15) {
			System.out.println("It's getting warmer by the day");
		} else if (temperature > 15 && temperature < 35) {
			System.out.println("Some very nice weather is comming");
		}
	}

	public void update(double temp, double humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}
