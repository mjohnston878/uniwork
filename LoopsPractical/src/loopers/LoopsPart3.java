/**
 * 
 */
package loopers;

/**
 * @author matthew
 *
 */
public class LoopsPart3 {
	/**
	 * constant value that is the number of times a string is output to screen
	 */
	public static final int UPPER = 10;

	/**
	 * Prints numbers 1 - 10 with a comma between numbers
	 * @param args 
	 */
	public static void main(String[] args) {
		
		for (int counter = 1; counter <= UPPER; counter++) {
			System.out.print(counter);
			
			// add a comma and space
			
			if (counter !=UPPER) {
				System.out.print(", ");
			}
		}
	}

}
