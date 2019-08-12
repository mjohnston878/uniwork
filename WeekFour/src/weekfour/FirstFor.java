/**
 * 
 */
package weekfour;

/**
 * @author matthew
 *
 */
public class FirstFor {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int count;
		count = 1;
			
		for (; count < 11;) {
			// loop body
			count++;
			System.out.println(count);
		}

		System.out.println("The last value was "+count);
		// countdown from 100 to 0
		// start of for loop
		for (int downCount = 100; downCount >= 0; downCount--) {
			if (downCount % 2 == 0)
				System.out.print(downCount + ", ");
		} // end of loop
		

	}

}
