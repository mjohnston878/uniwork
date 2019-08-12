/**
 * 
 */
package weekFive;

/**
 * @author matthew
 *
 */
public class BiggestNumberExample {

	/**
	 *  examples about methods returning the biggest number
	 * @param args
	 */
	public static void main(String[] args) {
		// call method
		int num = biggestNumber(20, 14);
		System.out.println(num);
		// or
		System.out.println("The biggest nunber is "+biggestNumber(32, 71));
	}
/**
 * This method returns the biggest value
 * @param num1
 * @param num2
 * @return the biggest number found
 */
	
	public static int biggestNumber (int num1, int num2) {
		
		
		int biggestNumber;
		
		if (num1 > num2) {
			biggestNumber = num1;
		} else {
			biggestNumber = num2;
		}
		
		return biggestNumber;
	}
	
}
