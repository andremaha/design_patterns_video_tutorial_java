package headfirst.command.remote;

public class CeilingFan {
	
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	String location;
	int speed;
	
	public CeilingFan(String location) {
		this.location = location;
		speed = OFF;
	}
	
	public void high() {
		speed = HIGH;
		System.out.println(location + " ceiling fan is tured to high speed");
	}
	
	public void low() {
		speed = LOW;
		System.out.println(location + " ceiling fan is tured to low speed");
	}
	
	public void medium() {
		speed = MEDIUM;
		System.out.println(location + " ceiling fan is tured to medium speed");
	}
	
	public void off() {
		speed = OFF;
		System.out.println(location + " ceiling fan is turned off");
	}
	
	public int getSpeed() {
		return speed;
	}
	
}
