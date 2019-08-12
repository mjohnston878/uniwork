/**
 * 
 */
package weekSeven;

import java.util.Arrays;

/**
 * @author matthew
 *
 */
public class PasRefPassValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// an object
		int[] myArray = {2,4,6,8,10};
		System.out.println(Arrays.toString(myArray));
		// pass by reference
		upDateArray(myArray);
		System.out.println(Arrays.toString(myArray));
		
		// call the method with a value and print out before the call and after
		// a primitive type
		int number = 999;
		System.out.println(number);
		// pass by value
		updateNum(number);
		System.out.println(number);
	}
	
	public static void upDateArray (int[] anArray) {
		
		for (int loop= 0; loop<anArray.length; loop++) {
			anArray[loop]++;
			
		}
	}
	public static void updateNum (int a) {
		a++;
	}
	
	
}
