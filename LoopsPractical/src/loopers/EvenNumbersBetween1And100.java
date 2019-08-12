/**
 * 
 */
package loopers;

/**
 * @author matthew
 *
 */
public class EvenNumbersBetween1And100 {

	/**
	 * Even numbers between 1 and 100
	 * @param args
	 */
	public static void main(String[] args) {
		for (int loop = 1000; loop >= 0; loop--) {
			if (loop == 333) {
				System.out.println("Launch aborted!");
				break;
			}
			// if (loop %2 == 0)
			System.out.println(loop);
		}
	}

}
