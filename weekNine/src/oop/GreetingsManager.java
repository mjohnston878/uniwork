/**
 * 
 */
package oop;

/**
 * @author matthew
 *
 */
public class GreetingsManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Start of greetings manager");
		
		MessageCentre msgC = new MessageCentre(); // creating an object
		
		msgC.displayWelcomeMessage("pm"); // envoking object
		
		
		System.out.println("End of greetings manager");
	}

}
