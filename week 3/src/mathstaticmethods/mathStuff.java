/**
 * 
 */
package mathstaticmethods;

/**
 * @author matthew
 * Method about math stuff
 */
public class mathStuff {

	/**
	 * @param args
	 */
	 // class about math stuff
	public static void main(String[] args) {
		
		double number;
		number = 900;
		
		//static method calls
		System.out.println("Square root: "+Math.sqrt(number));
		System.out.println("8 raised to the power of 2:"+Math.pow(8, 2));
		
		// use of static fields
		
		double radius = 6;
		double area = (radius*radius)*Math.PI;
		System.out.printf("Area of a circle with radius %.2f is %.2f",radius, area);
	}

}
