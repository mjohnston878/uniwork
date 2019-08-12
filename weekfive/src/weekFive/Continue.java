/**
 * 
 */
package weekFive;

/**
 * @author matthew
 *
 */
public class Continue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int loop = 1;
			while(loop<10) {
				System.out.println("Yes.."+loop);
				
				
				if (loop==2) {
					System.out.println("Miss a few");
					loop+=3; // compount assignment operator loop=loop+3
					continue;
				}
				System.out.println("Next...");
				loop++;
			}
			
	}

}
