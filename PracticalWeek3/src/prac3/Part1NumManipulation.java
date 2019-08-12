/**
 * 
 */
package prac3;

import java.util.Scanner;

/**
 * @author matthew
 *
 */
public class Part1NumManipulation {

	/**
	 * //about user number inputs
	 * @param args
	 */
	public static void main(String[] args) {
		// declare vars to store number from user
		double inputNumber;
		Scanner scanner = new Scanner(System.in);
		
		//get number from user
		System.out.println("Please enter a decimal point number");
		inputNumber = scanner.nextDouble();
		
		// output from screen
		System.out.printf("Number rounded to two decimal places: %.2f %n",inputNumber);
		System.out.printf("Number squared to three decimal places: %.3f %n",Math.pow(inputNumber, 2));
		System.out.printf("Number cubed to three decimal places: %.3f %n",Math.pow(inputNumber, 3));
		System.out.printf("Your square root to three decimal places: %.4f %n",Math.sqrt(inputNumber));

		// closing resources
		scanner.close();
	
	}
	
	

}
