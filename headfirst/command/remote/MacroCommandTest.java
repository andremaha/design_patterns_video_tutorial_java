package headfirst.command.remote;

public class MacroCommandTest {

	public static void main(String[] args) {
		
		// Receivers
		Light light = new Light();
		Stereo stereo = new Stereo();
		CD cd = new CD("Revolver");
		
		// Invoker
		RemoteControl remote = new RemoteControl();
		
		// Commands
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);
		StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo, cd);
		StereoOffWithCDCommand stereoOff = new StereoOffWithCDCommand(stereo, cd);
		
		// Party Elements
		Command[] partyOn = {lightOff, stereoOn};
		Command[] partyOver = {lightOn, stereoOff};
		
		// MacroCommand
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOverMacro = new MacroCommand(partyOver);
		
		remote.setCommand(0, partyOnMacro, partyOverMacro);
		
		System.out.println(remote);
		
		System.out.println("--------------- Let the Party Begin ----------");
		remote.onButtonWasPushed(0);
		System.out.println("--------------- Party's Over -----------------");
		remote.offButtonWasPushed(0);
		
	}
	
}
