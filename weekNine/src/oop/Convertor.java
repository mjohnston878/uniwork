/**
 * 
 */
package oop;

/**
 * @author matthew
 *
 */
public class Convertor {

	public void cmToInches(double cm) {
		
		System.out.printf(%.2f, cm * 0.394);
	}
	
	public void inchesToCms(double inch ) {
		System.out.println(inch * 2.54);
	}
	
	public void kmToMiles(double km) {
		System.out.println(km * 0.621);
	}
	
	public void milesToKms(double mile) {
		System.out.println(mile * 1.609);
	}
}
