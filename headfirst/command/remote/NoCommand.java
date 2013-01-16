package headfirst.command.remote;

public class NoCommand implements Command {

	public void execute() {
		System.out.println("There is nothing to execute - I am null object");
	}
	
	public void undo() {
		System.out.println("There s nothing to undo - I am null object");
	}
	
}
