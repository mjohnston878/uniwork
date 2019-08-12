/**
 * 
 */
package methods;

/**
 * @author matthew
 *
 */
public class MethodReturnTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(areaOfTriangle(5, 15));
		
	}
	public static int areaOfTriangle (int height, int base) {
		
		int area;
		
		area = (height*base) / 2;
		 
		return area;
		
	}

}
