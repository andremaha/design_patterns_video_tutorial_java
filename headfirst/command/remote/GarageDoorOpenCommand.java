package headfirst.command.remote;

public class GarageDoorOpenCommand implements Command {

	GarageDoor garageDoor;
	
	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	
	public void execute() {
		garageDoor.up();
		garageDoor.lightsOn();
		garageDoor.stop();
	}
	
	public void undo() {
		garageDoor.lightOff();
		garageDoor.down();
		garageDoor.stop();
	}

}
