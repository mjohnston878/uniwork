/**
 * 
 */
package overloading;

/**
 * @author matthew
 *
 */
public class MultiplicationMachine {
	
	public static double multiplyNumbers(double num1, double num2) {
		return num1 * num2;
	}

	public static double mulitplyNumbers(double num1, double num2, double num3) {
		return num1 * num2 * num3;
	}
	
	public static void main (String [] args) {
		System.out.println(multiplyNumbers(3.5, 4.2));
	}
}

