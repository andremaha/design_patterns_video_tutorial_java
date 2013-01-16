package headfirst.command.remote;

/**
 * Concrete implementation of the Command interface
 * 
 * 
 * @author	Andrey Esaulov
 * @version 0.2
 * @changed Jan 16, 2013
 */
public class StereoOffWithCDCommand implements Command {

	Stereo stereo;
	CD cd;
	
	public StereoOffWithCDCommand(Stereo stereo, CD cd) {
		this.stereo = stereo;
		this.cd = cd;
	}
	
	public void execute() {
		stereo.ejectCD();
		stereo.off();
	}
	
	public void undo() {
		stereo.on();
		stereo.setCD(cd);
		stereo.setVolume(11);
	}

}
