/**
 * 
 */
package wrappers;

/**
 * @author matthew
 *
 */
public class ComparingIntegerObjects {

	/**
	 * 
	 */
	public ComparingIntegerObjects() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Integer intW1 = new Integer(3);
		Integer intW2 = new Integer(100);
		
		if (intW1.equals(intW2)) {
			System.out.println("Same");
		} else {
			System.out.println("Not the same");
		}
		
		
		
		
		System.out.println("return from compareTo is "+intW1.compareTo(intW2));
		
	}

}
