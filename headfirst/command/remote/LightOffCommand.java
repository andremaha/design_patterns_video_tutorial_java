package headfirst.command.remote;

/**
 * The command that is specialized on dealing with lights, or, rather, telling the lights what to do.
 * It "translates" form the client language execute() into the light language on()
 * 
 * @author	Andrey Esaulov
 * @version 0.2
 * @changed Jan 16, 2013
 */
public class LightOffCommand implements Command {

	Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}
	
	public void execute() {
		light.off();
	}
	
	public void undo() {
		light.on();
	}

}
