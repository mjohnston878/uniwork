/**
 * 
 */
package shoeStuff;

// import statements
import java.util.Scanner;

/**
 * Class is going to interact with the user
 * @author matthew
 *
 */
public class KeyboardInputStuff {

	/**
	 * Method gets user's name and output hello message
	 * @param args
	 */
	public static void main(String[] args) {
		
		// declaring vars
		String usersName;
		
		// get the scanner and set it up
		Scanner scanner = new Scanner (System.in);
		
		// output message of hello and prompt for user's name
		System.out.println("Hello, what's your name?");
		
		// get the user's name
		usersName = scanner.next();
		
		// output message with user's name
		System.out.println("Hello there, " +usersName);
		
	}

}
