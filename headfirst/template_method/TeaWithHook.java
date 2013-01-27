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

public class TeaWithHook extends CaffeineBeverageWithHook {

	void brew() {	
		System.out.println("Putting the tea leaves in the pot and pouring some hot steam water");
	}

	void addCondiments() {
		System.out.println("Adding lemon - 'cause we like Russian Style Tea");
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
		
		System.out.println("Would you like some lemon with your tea (yes/no)? ");
		
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
