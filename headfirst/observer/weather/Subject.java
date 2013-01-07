package headfirst.observer.weather;
/**
 * Implementation of the Observer Design Pattern. This is the Subject interface that will register, remove and
 * notify observers.
 * 
 * @author 	Andrey I. Esaulov
 * @version 0.1
 * @changed	2013-01-07	
 */
public interface Subject {

	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
	
}
