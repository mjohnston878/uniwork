/**
 * 
 */
package oop;

/**
 * @author matthew
 *
 */
public class MessageCentre {
	public void displayWelcomeMessage(String timeOfDay) {
		
		String message;
		message = "Hello ";
		
		if (timeOfDay.equalsIgnoreCase("am")) {
			message+="and good morning";
		} else if (timeOfDay.equalsIgnoreCase("pm")) {
			message+="and good afternoon";
		} else {
			message+="and a good day";
		}
		System.out.println(message);
	}

}
