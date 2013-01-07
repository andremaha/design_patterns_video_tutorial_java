package headfirst.observer.weather;
/**
 * Receives the data from the external source and channels it though to the WeatherData (Subject), which in turn will
 * notify its Observers, that will update the displays.
 * 
 * @author	Andrey Esaulov
 * @version 0.1
 * @changed Jan 7, 2013
 */
public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		IphoneDisplay iphoneDisplay = new IphoneDisplay(weatherData);
		
		weatherData.setMesurements(25, 65, 30.4f);
		weatherData.setMesurements(7, 75, 35.4f);
		weatherData.setMesurements(16, 55, 24.4f);
	}

}
