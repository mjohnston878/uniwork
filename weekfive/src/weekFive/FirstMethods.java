/**
 * 
 */
package weekFive;

/**
 * @author matthew
 *
 */

public class FirstMethods {
/**
 *  method to make a count down
 * @param startNumber
 */
	public static void countdown(int startNumber) {
		for (int i = startNumber; i >= 0; i--) {
			System.out.println(i);
		}
				
	}

	public static void tenNames(int name, String Matt) {

		while (name <= 10) {

			System.out.println("Matt");
			name++;
		}
	}

	/**
	 * Method to get my name
	 */
	public static void myName() {
		System.out.println("Matt");
	} // end of method

	/**
	 * gets tickets for the lads
	 */
	public static void westLife() {
		System.out.println("Got tickets!");
	}

	/**
	 * main method - start point
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Start of main.");

		// invoke the method
		westLife();

		myName();

		tenNames(0, "Matt");
		
		countdown(10);

		System.out.println("End of main.");
	} // end of main method

} // end of class
