/**
 * 
 */
package mathstaticmethods;
import java.util.Scanner;

/**
 * @author matthew
 *
 */
//import scanner
public class moreMathStuff {

	/**
	 * @param args
	 */
	// class about square roots
	public static void main(String[] args) {
		
		//declare scanner
		double numberInput;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your number?");
		
		numberInput = scanner.nextDouble();
		
		System.out.printf("The square root of your number is: %.2f", Math.sqrt(numberInput));

		scanner.close();
		
		
	}

}
