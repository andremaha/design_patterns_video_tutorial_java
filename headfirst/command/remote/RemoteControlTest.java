package headfirst.command.remote;

public class RemoteControlTest {

	public static void main(String[] args) {
		
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);
		
		GarageDoor garageDoor = new GarageDoor(light);
		GarageDoorOpenCommand doorUp = new GarageDoorOpenCommand(garageDoor);
		
		remote.setCommand(lightOn);
		remote.buttonPressed();
		remote.setCommand(lightOff);
		remote.buttonPressed();
		
		remote.setCommand(doorUp);
		remote.buttonPressed();
		
		
		RemoteControl complexRemote = new RemoteControl();
		Stereo stereo = new Stereo();
		CD cd = new CD("Sgt. Pepper’s Lonely Hearts Club Band");
		StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo, cd);
		StereoOffWithCDCommand stereoOff = new StereoOffWithCDCommand(stereo, cd);
		
		complexRemote.setCommand(0, lightOn, lightOff);
		complexRemote.setCommand(1, stereoOn, stereoOff);
		
		System.out.println(complexRemote);
		
		complexRemote.onButtonWasPushed(0);
		complexRemote.onButtonWasPushed(1);
		complexRemote.offButtonWasPushed(0);
	}
	
}
