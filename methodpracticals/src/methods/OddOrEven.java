/**
 * 
 */
package methods;

/**
 * @author matthew
 *
 */
public class OddOrEven {

	/**
	 * When passed any given integer, will determine whether it is odd or even.  
	 * @param number (integer only)
	 */
	
	public static void oddOrEven (int number) {
		
		if (number % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		
	}
	/**
	 * will convert upper case to lower case.  
	 * @param letter (char only)
	 */
	public static void convertFromUpperTolower (char letter) {
		if (Character.isUpperCase(letter)) { // start of if
			System.out.println(Character.toLowerCase(letter));
		} else { 
			System.out.println("Already in lower case");
		} // end of if
	}
	
	/**
	 * When passed a par of integers, will determine if the second is a multiple of the first
	 * @param num1 - base number
	 * @param num2 - number to check if it is the multiple of the base number
	 */
	public static void isMultiple ( int num1, int num2) {
		if ( num2 % num1 == 0) {
			System.out.printf("%d is a multiple of %d", num1, num2);
		} else {
			System.out.printf("%d is not a mulitple of %d", num1, num2);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Start Main");
		oddOrEven(4);
		oddOrEven(5);
		convertFromUpperTolower('a');
		
		isMultiple(6, 9);
		System.out.println("End Main");
	}

}
