/**
 * 
 */
package methods;

import java.util.Random;

/**
 * @author matthew
 *
 */
public class RandonNumberGenerator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		randomNumberGenerator();
	}
	/**
	 * 1.. 100
	 */
	public static void randomNumberGenerator() {
		
		Random rand = new Random();
		int number = 0;
		
		for (int loop = 1; loop <=10; loop++) {
			number = rand.nextInt(100);
			number++;
			System.out.println(number);
		}
	}
}
