/**
 * 
 */
package weekSeven;

/**
 * @author matthew
 *
 */
public class ShoeSize {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double size1, size2, size3;
		size1 = 8;
		size2 = 9;
		size3 = 9.5;
		
		System.out.println("Average Size: " + shoeAveageCal(size1, size2, size3));
		
	}
	public static double shoeAveageCal(double size1, double size2, double size3) {
		
		return (size1+size2+size3) / 3;
		
	}
}
