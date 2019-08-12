/**
 * 
 */
package loopers;

/**
 * @author matthew
 *
 */
public class LoopsPart1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declare vars
		int sum, num;
		// assign values
		num = 1;
		sum = 0;
		
		// do some maths
		//sum = num +sum;
		while (num<=10) {	
			sum += num;
			num++;
		} // end of loop
		// output to screen
		System.out.println("The sum is: "+sum);
		
	}

}
