package headfirst.command.remote;

/**
 * Essential part of the Command Design Pattern - central Command interface.
 * 
 * @author	Andrey Esaulov
 * @version 0.2
 * @changed Jan 11, 2013
 */
public interface Command {

	public void execute();
	public void undo();
	
}
