package headfirst.command.remote;

/**
 * General invoker in the Command Design Pattern. 
 * Remote conrtol has 7 slots, each of them can be programmed with the on/off switch.
 * The programming is done with setCommand(), when the slot is not programmed it automatically
 * gets null object of NoCommand. 
 * On/Off buttons will envoke the execute() methods on the assigned commands.
 * 
 * @author	Andrey Esaulov
 * @version 0.1
 * @changed Jan 15, 2013
 */
public class RemoteControl {

	Command[] onCommands;
	Command[] offCommands;
	
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		
		Command noCommand = new NoCommand();
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
	}
	
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
	}
	
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------- Remote Control ------\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "\t\t\t" + offCommands[i].getClass().getName() + "\n");
		}
		return stringBuff.toString();
	}
}
