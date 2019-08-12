/**
 * 
 */
package mathstaticmethods;
import java.util.Scanner;
/**
 * @author matthew
 *
 */
public class labThreeMathOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	double inputNumber;
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Please enter a decimal point number in the format xx.xxxx eg 12.3456 ");
	
	inputNumber = scanner.nextDouble();
	//rounded nymber
	System.out.printf("Number rounded (two decimal places): %.2f", (inputNumber));
	//squared number
	System.out.printf("\nNumber Squared (Three decimal places): %.3f", Math.sqrt(inputNumber));
	//cubed number
	System.out.printf("\nNumber cubed to (three decimal places): %.3f", Math.pow(inputNumber, 3)); 
	//square root
	System.out.printf("\nSquare root (four decimal places): %.4f", Math.sqrt(inputNumber));
	
	scanner.close();
	}
	
	
}
