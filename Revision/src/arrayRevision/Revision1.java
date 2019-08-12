/**
 * 
 */
package arrayRevision;

/**
 * @author matthew
 *
 */
public class Revision1 {

	/**
	 * 
	 */
	public Revision1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] array = {87, 68, 94, 100, 83,78, 85, 91, 76, 87};
		int total = 0;
		
		for (int number : array) {
			total += number;
		}
		
		System.out.println(total);
	}

}
