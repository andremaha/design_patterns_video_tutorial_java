package headfirst.command.remote;

/**
 * The command that is specialized on dealing with lights, or, rather, telling the lights what to do.
 * It "translates" form the client language execute() into the light language on()
 * 
 * @author	Andrey Esaulov
 * @version 0.1
 * @changed Jan 11, 2013
 */
public class LightOnCommand implements Command {

	Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	public void execute() {
		light.on();
	}

}
