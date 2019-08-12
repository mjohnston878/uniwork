/**
 * 
 */
package prac3;

import java.util.Scanner;

/**
 * @author matthew
 *
 */
public class Part3AgeChecker {

	/**
	 * class about ages and user input
	 * @param args
	 */
	public static void main(String[] args) {
		// declare vars
		int age;
		String name;
		Scanner scanner = new Scanner(System.in);
		
		// input here - age
		System.out.println("What age are you?");
		age = scanner.nextInt();
		
		// check the input age - output messages
		if (age>=18) {
			
			// prompt for name, output all details
			System.out.println("What is yout name?");
			name = scanner.next();
			System.out.printf("Your name is %s and age is %s",name, age);
		} else if ((age >=1) && (age<=17)) {
			System.out.println("To young to contine");
		}
		else {
			System.out.println("Sorry, I do not recognise your input");
		}
		
		
		scanner.close();
	}

}
