/**
 * 
 */
package loopers;

/**
 * @author matthew
 *
 */
public class Countdown {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int loop = 10; loop > 0; loop--) {
			System.out.print(loop);
			System.out.print(", ");
		}
		System.out.print("Lift off!");
	}

}
