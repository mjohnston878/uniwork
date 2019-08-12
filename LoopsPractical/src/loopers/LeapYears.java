/**
 * 
 */
package loopers;

/**
 * @author matthew
 *
 */
public class LeapYears {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		for (int year = 1910;year<=1990;year++) {
			if (year % 4 ==0) {
				System.out.println(year+"*");
			}
		}
	}

}
