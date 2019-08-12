/**
 * 
 */
package weekSeven;

/**
 * @author matthew
 *
 */
public class twoDArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Create the 2d Array
		//int[][] my2D = new int[3][4];
		
		int[][] my2D = { {2,3,4,},{5,7,9},{12,67,2} };

		// set some values
		my2D[0][0] = 999;
		// my2D[2][3] = 999;

		// Output to screen all values
		for (int row = 0; row < my2D.length; row++) {
			for (int col = 0; col < my2D[row].length; col++) {
				System.out.print(my2D[row][col] + "\t");
			}
			System.out.println();
		}

	}

}
