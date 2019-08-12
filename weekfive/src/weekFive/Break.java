/**
 * 
 */
package weekFive;

/**
 * @author matthew
 *
 */
public class Break {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int loop = 10; loop >=0; loop--) {
			
			if (loop==3) {
				System.out.println("Abort!");
				break; // leaving the loop
			}
			
			System.out.println(loop);
		}
		
		System.out.println("End");
	}
	

}
