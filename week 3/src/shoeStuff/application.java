/**
 * 
 */
package shoeStuff;


/**
 * class javadoc comment
 * @author matthew
 * 
 
 * // import for the scanner class
 *
 */
import java.util.Scanner;

public class application {

	/**
	 * method javadoc
	 * @param args
	 */
	public static void main(String[] args) {
		//declaring var
		double shoeSize;

		//activating scanner
		Scanner scanner = new Scanner(System.in);

		System.out.println("What is your shoe size?");
		
		shoeSize = scanner.nextDouble();
		
		if (shoeSize > 6) {
		System.out.println("Adult Section");
		
	} //end of if statement
		
		if(shoeSize <= 6) {
			System.out.println("Kids Section");
		
		} // end of if statement
		
		scanner.close();
					
	}
		
	}
