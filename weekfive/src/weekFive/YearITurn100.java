/**
 * 
 */
package weekFive;

/**
 * @author matthew
 *
 */
public class YearITurn100 {

	/**
	 * figuring out what year I turn 100
	 * @param args
	 */
	public static void in100Years(int myAge) {
		// declare vars
		int year = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR); 

		int turn100 = year - myAge + 100;
		// print statement
		System.out.println("I will be 100 on the year "+turn100 );
		
	} // end of method
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		in100Years(26);
	} // end of main method

} // end of class
