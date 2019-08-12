/**
 * 
 */
package oop;

/**
 * @author matthew
 *
 */
public class BuilderHelperApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Convertor convertor = new Convertor();
		
		System.out.printf("From cm to inches: %.2f", convertor.cmToInches(20));
		
		convertor.inchesToCms(%.2f, 10);
		
		convertor.kmToMiles(5);
		
		convertor.milesToKms(15);
	}

}
