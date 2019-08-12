/**
 * 
 */
package methods;

/**
 * @author matthew
 *
 */
public class PrintStars {

	public static void printStars() {
		int count = 5;
		// print the number
		for (int outerLoop = count; outerLoop >0; outerLoop--) {
			System.out.print(outerLoop +" ");
			// print the stars
			for (int innerLoop = 1; innerLoop<=outerLoop; innerLoop++) {
				System.out.print("*");
			}
			System.out.println();
		} // end of outer loop
		
		
		
	}
	
	public static void main(String[] args) {
		
		printStars();
	}

}
