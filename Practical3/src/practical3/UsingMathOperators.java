/**
 * 
 */
package practical3;
import java.util.Scanner;
/**
 * @author matthew
 *
 */
public class UsingMathOperators {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double number;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your number?");
		
		number = scanner.nextDouble();
		
		System.out.println("Rounded to two decimal places: "+Math.round("number"));
	}

}
