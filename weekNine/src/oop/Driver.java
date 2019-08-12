/**
 * 
 */
package oop;

/**
 * @author matthew
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SimpleCalc calc = new SimpleCalc();
		
		System.out.println("Add");
		calc.add(2, 4);
		System.out.println("Divide");
		calc.divide(9, 3);
		System.out.println("Subtract");
		calc.subtract(9, 4);
		System.out.println("Multiply");
		calc.multiply(15, 2);
	}

}
