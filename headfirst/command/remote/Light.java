package headfirst.command.remote;

/**
 * Simple class that has no idea about command patterns and just does its job - switching the light on and off
 * 
 * @author	Andrey Esaulov
 * @version 0.1
 * @changed Jan 11, 2013
 */
public class Light {

	public void on() {
		System.out.println("Light is on");
	}
	
	public void off() {
		System.out.println("Light is off");
	}
	
}
