package headfirst.command.remote;

/**
 * Concrete implementation of the Command interface
 * 
 * 
 * @author	Andrey Esaulov
 * @version 0.1
 * @changed Jan 15, 2013
 */
public class StereoOnWithCDCommand implements Command {

	Stereo stereo;
	CD cd;
	
	public StereoOnWithCDCommand(Stereo stereo, CD cd) {
		this.stereo = stereo;
		this.cd = cd;
	}
	
	public void execute() {
		stereo.on();
		stereo.setCD(cd);
		stereo.setVolume(11);
	}

}
