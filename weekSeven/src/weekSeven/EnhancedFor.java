/**
 * 
 */
package weekSeven;

import java.util.Arrays;

/**
 * @author matthew
 *
 */
public class EnhancedFor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] children = {2,6,0,1,4,7};
		
		for (int loop= 0; loop<children.length ;loop++) {
			System.out.println(children[loop]);
			
		}
		
		System.out.println("_______________");
		
		// enhanced for
		//read only (cant change an array)
		for (int childNumber : children) {
			System.out.println(childNumber);
		}
		
		System.out.println(Arrays.toString(children));
		
		
	}

}
