/**
 * 
 */
package methods;

/**
 * @author matthew
 *
 */
public class CounterAndAverages {

	public static void counter(int upperLimit) {
		int total = 0;
		double average = 0.0;
		
		for (int loop = 1; loop<=upperLimit; loop++) {
			total += loop;
		}
		System.out.println("Total is: "+total);
		
		average = (double) total / (double) upperLimit;
		System.out.printf("Average is: %.2f",+average);
		System.out.println();
	}
	
	public static void main(String[] args) {

		
		counter(100);
	}

}
