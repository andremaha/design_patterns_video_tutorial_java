package headfirst.command.remote;

public class RemoteControlUndoTest {

	public static void main(String[] args) {
		
		RemoteControl remoteControl = new RemoteControl();
		
		Light light = new Light();
		
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);
		
		remoteControl.setCommand(0, lightOn, lightOff);
		
		// Switching the lights on
		remoteControl.onButtonWasPushed(0);
		
		// Switching the lights off
		remoteControl.offButtonWasPushed(0);
		
		System.out.println(remoteControl);
		
		// Oh, wait, we forgot to set the alarm, undo the switching the lights off
		remoteControl.undoButtonWasPushed();
		
	}
	
}
