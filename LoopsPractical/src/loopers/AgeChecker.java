/**
 * 
 */
package loopers;

import java.util.Scanner;

/**
 * @author matthew
 *
 */
public class AgeChecker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// vars
		int age;
		Scanner scanner = new Scanner(System.in);
		do {
			// ask user for age
			System.out.println("What is your age?");
			age = scanner.nextInt();

			// validate age
		} while (age < 1 || age > 120);

		// output message
		if ((age >= 1) && (age <= 30)) {
			System.out.println("You are young");
		} else if ((age >= 31) && (age <= 60)) {
			System.out.println("You are getting on");
		} else if ((age >= 61) && (age <= 120)) {
			System.out.println("You look amazing for your age");
		} else {
			System.out.println("Try that again");
		}
		// close scanner
		scanner.close();
	}

}
