/**
 * 
 */
package loopers;

import java.util.Scanner;

/**
 * @author matthew
 *
 */
public class NameLoop {
	/**
	 * Constant value that is the number of times a string is output to screen
	 */
	public static final int UPPER_LIMIT = 10;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// declare vars
		String name;
		Scanner scanner = new Scanner(System.in);
		
		// get name from user
		System.out.println("What is your name?");
		name = scanner.next();
		

		// output a number of times to screen
		for (int loop = 1; loop <= UPPER_LIMIT; loop++) {
			// loop body
			System.out.println(name);
		}
		scanner.close();
	}
		
}
