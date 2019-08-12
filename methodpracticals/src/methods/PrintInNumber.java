/**
 * 
 */
package methods;

import java.util.Scanner;

/**
 * @author matthew
 *
 */
public class PrintInNumber {
/**
 * 
 * @param input
 */
	public static void printNumberInWord(int input) {
		
		System.out.println("What is your number?");
		
		Scanner scanner = new Scanner(System.in);
		
		input = scanner.nextInt();
		
		System.out.println("Your number in words is " +input);
		
		if (input ==1) {
			System.out.println("One");
		} else if (input ==2) {
			System.out.println("Two");
		} else if (input == 3) {
			System.out.println("Three"); 
		} else if (input == 4) {
			System.out.println("Four");
		} else if (input == 5) {
			System.out.println("Five");
		} else if (input == 6) {
			System.out.println("Six");
		} else if (input == 7) {
			System.out.println("Seven");
		} else if (input == 8) {
			System.out.println("Eight");
		} else if (input == 9) {
			System.out.println("Nine");
		} else if (input == 10) {
			System.out.println("Ten");
		} else {
			System.out.println("Unknown Number");
		}
		
		
		scanner.close();
	}
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNumberInWord(0);
	}

}
