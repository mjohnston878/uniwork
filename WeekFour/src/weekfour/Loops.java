/**
 * 
 */
package weekfour;

/**
 * @author matthew
 *
 */
public class Loops {

	/**
	 * Class about loops
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// declare vars
		int loop;
		loop = 20;

		// start of loop
		while (loop > 1) {
			System.out.println(loop);
			loop--;
		}

		// do while counter
		int doWhileCounter;
		doWhileCounter = 2;

		do {
			System.out.println(doWhileCounter);
			doWhileCounter++;
		} while (doWhileCounter < 10);

		

	}
}
