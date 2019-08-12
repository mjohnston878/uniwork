/**
 * 
 */
package prac3;

// import scanner
import java.util.Scanner;

/**
 * @author matthew
 *
 */
public class Part2MastersGrader {

	/**
	 * // about a masters grading system with user input
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// declare vars
		Scanner scanner = new Scanner(System.in);
		int mark;

		// input from user

		System.out.println("Enter Mark");
		mark = scanner.nextInt(); // scann + control space to quick import scanner

		// output classification
		if ((mark >= 0) && (mark <= 49)) {
			System.out.println("Fail");
		} else if ((mark >= 50) && (mark <= 59)) {
			System.out.println("Classification: Pass");
		} else if ((mark >= 60) && (mark <= 69)) {
			System.out.println("Classification: Merit");
		} else if ((mark >= 70) && (mark <= 100)) {
			System.out.println("Classification: Distinction");
		} else {
			System.out.println("Error - Please enter a number 0 - 100");
		}

		// close scanner
		scanner.close();
	}

}
