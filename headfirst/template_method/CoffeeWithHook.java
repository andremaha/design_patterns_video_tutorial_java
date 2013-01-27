package headfirst.template_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Implements the abstract CaffeineBeverageWithHook by suppling two methods there are needed to complete the 
 * Template Method:
 * 
 * - brew()
 * - addCondiment()
 * 
 * Additionally we can also "hook into" the template method by overriding the 
 * 
 * - customerWantsCondiment() 
 * 
 * which is true by default. 
 * 
 * 
 * @author	Andrey Esaulov
 * @version 0.1
 * @changed Jan 27, 2013
 */

public class CoffeeWithHook extends CaffeineBeverageWithHook {

	void brew() {	
		System.out.println("Brewing the Coffee with our AirPress");
	}

	void addCondiments() {
		System.out.println("Adding milk and sugar - 'cause the customer wants it this way");
	}
	
	public boolean customerWantsCondiments() {
		String answer = getUserInput();
		
		if (answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}
	
	public String getUserInput() {
		String answer = null;
		
		System.out.println("Would you like some milk and sugar with your coffe (yes/no)? ");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			answer = in.readLine();
		} catch(IOException ioe) {
			System.err.println("IO error trying to read your answer");
		}
		
		if (answer == null) {
			return "no";
		}
		
		return answer;
	}

}
