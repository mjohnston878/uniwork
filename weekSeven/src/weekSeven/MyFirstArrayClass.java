/**
 * 
 */
package weekSeven;

/**
 * @author matthew
 *
 */
public class MyFirstArrayClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// shoe sizes 8 8 10 9
		
		// declare array
		int[] myArray;
		
		
		// initialise the value
		myArray = new int[4];
		
		// assigning values
		myArray[0] = 8;
		myArray[1] = 8;
		myArray[2] = 10;
		myArray[3] = 9;
		
		// print values out
		System.out.println(myArray[0]);
		System.out.println(myArray[1]);
		System.out.println(myArray[2]);
		System.out.println(myArray[3]);
		
		myArray[3] = 10;
		
		
		// loop
		for (int loop = 0; loop<myArray.length; loop++) {
			System.out.println(myArray[loop]);
		}
		

		
	}

}
