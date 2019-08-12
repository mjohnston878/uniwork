/**
 * 
 */
package overloading;

/**
 * @author matthew
 *
 */
public class TestMultiply {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Test data
		double num1, num2, num3;
		
		num1 = 3.0;
		num2 = 4.0;
		num3 = 5.9;
		
		double result = MultiplicationMachine.multiplyNumbers(3, 4);
		if (result == 12.0) {
			System.out.println("Test case 1: Passed");
		} else {
			System.out.println("Test case 1: Failed");
		}
	}

}
