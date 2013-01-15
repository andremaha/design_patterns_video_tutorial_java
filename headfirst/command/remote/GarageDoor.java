package headfirst.command.remote;

/**
 * Another concrete class that knows nothing about other commands and is busy with its own problems -
 * like pulling the door up, down, stopping, hitting the lights etc..
 * 
 * 
 * @author	Andrey Esaulov
 * @version 0.1
 * @changed Jan 11, 2013
 */
public class GarageDoor {

	Light light;
	
	public GarageDoor(Light light) {
		this.light = new Light();
	}
	
	public void up() {
		System.out.println("The garage door is up");
	}
	
	public void down() {
		System.out.println("The garage door is down");
	}
	
	public void stop() {
		System.out.println("The garage door movement stoped");
	}
	
	public void lightsOn() {
		light.on();
	}
	
	public void lightOff() {
		light.off();
	}
	
}
