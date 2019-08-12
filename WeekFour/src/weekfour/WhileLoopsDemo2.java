/**
 * 
 */
package weekfour;

/**
 * @author matthew
 * while loops in reverse
 */
public class WhileLoopsDemo2 {

	/**
	 *  while loop in reverse
	 * @param args
	 */
	public static void main(String[] args) {
		// declaring vars
		int number;
		number = 1000;
		
		//loop continuation condition
		while (number != 0) {
			// output
			System.out.println("Number count: " +number);
			// decrement
			number--;
		}
	}

}
