/**
 * 
 */
package weekfour;

/**
 * @author matthew
 *
 */
public class WhileLoopsDemo {

	/**
	 * while loop revision
	 * while loop that counts from 1 to 100
	 * @param args
	 */
	public static void main(String[] args) {
		
		// declare vars
		int count; // control variable
		count = 1; // initial value
		
		while (count <= 100) { // loop continuation condition (true or false)
			System.out.println("Count is: "+count);
			count++; //increment
		}
		
	}

}
