package headfirst.observer.weather;
import java.util.ArrayList;

/**
 * @author	Andrey Esaulov
 * @version 0.1
 * @changed 2013-01-07
 */
public class WeatherData implements Subject {
	
	private ArrayList observers;
	private double temperature;
	private double humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void mesurementsChanged() {
		notifyObservers();
	}
	
	public void setMesurements(double temperature, double humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		mesurementsChanged();
	}
}
