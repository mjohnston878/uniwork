/**
 * 
 */
package weekfour;

import java.util.Scanner;

/**
 * @author matthew
 *
 */
public class MenuOptions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// declare vars
		int option;
		Scanner scanner = new Scanner(System.in);
		
		do {
			// show the menu
			System.out.println("Menu ______________");
			System.out.println("1. File");
			System.out.println("2. Edit");
			System.out.println("3. Delete");
			System.out.println("4. Exit");
			System.out.println("Enter Option ");
		
			// get the users input
			option = scanner.nextInt();
			
			
			// do something with the input
			switch (option)  {
			case 1:
				System.out.println("Your option is: File");
				break;
			case 2: 
				System.out.println("Your option is: Edit");
				break;
			case 3: 
				System.out.println("Your option is: Delete");
				break;
			case 4:
				System.out.println("Yout option is: Exit");
				break;
			default:
				System.out.println("Try that again.");
		}
		} while (option !=4);	
		
		System.out.println("Program over!");		
		scanner.close();
	}

}
