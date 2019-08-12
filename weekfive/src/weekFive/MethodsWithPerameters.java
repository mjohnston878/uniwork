/**
 * 
 */
package weekFive;

/**
 * @author matthew
 *
 */
public class MethodsWithPerameters {

	/**
	 * @param args
	 */
	
	public static void weekOfYear() {
		java.util.Calendar cal = java.util.Calendar.getInstance();
		int dayOfMonth = cal.get(java.util.Calendar.WEEK_OF_YEAR);
		System.out.println("Week number is: "+String.valueOf(dayOfMonth));
	}
	
	public static void areaOfCircle(double radius) {
		System.out.println("Area of a cricle: "+Math.PI*radius*radius);
	}
	
	
	public static void main(String[] args) {
		
		weekOfYear();
		areaOfCircle(234);
		
		
	}

}
