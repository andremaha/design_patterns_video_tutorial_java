package headfirst.observer.weather;
/**
 * Implementation of the Observer Design Pattern. This is the Observer interface which is to be updated, once the state
 * of the subject has been changed.
 * 
 * @author 	Andrey Esaulov
 * @version 0.1
 * @changed 2013-01-07
 */
public interface Observer {

	/**
	 * The update method will be used to transfer the changed state form the subject (Weather Station)
	 * to the objserver.
	 * 
	 * @param temp
	 * @param humidity
	 * @param pressure
	 */
	public void update(double temp, double humidity, float pressure);
	
}
