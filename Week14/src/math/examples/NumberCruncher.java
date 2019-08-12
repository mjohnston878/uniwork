/**
 * 
 */
package math.examples;

/**
 * @author matthew
 *
 */
public class NumberCruncher {

	public int addNumbers(int num1, int num2) {
		return num1+num2;
	}
	
	public int addNumbers(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	
	public int multiplyNumbers(int num1, int num2) {
		return num1*num2;
	}
	
	public int multiplyNumbers(int num1, int num2, int num3) {
		return num1*num2*num3;
	}
	
	public double divNumbers(double num1, double num2) throws Exception {
		if (num2==0) {
			// bad
			throw new Exception();
		} else {
			// good
			return num1 / num2;

		}
		
	}
	
}
