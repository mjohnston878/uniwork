/**
 * 
 */
package wrappers;

import java.util.Arrays;

/**
 * @author matthew
 *
 */
public class WrapperExercise {

	/**
	 * 
	 */
	public WrapperExercise() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int i1 = 33;
		String i2 = "999";
		double i3 = 23.4;
		Integer i4 = 4;
		long i5 = 67;
		int i6 = 31;
		String i7 = "60";
		float i8 = 22.2f;
		int i9 = -22;
		
			
		Double[] numbers = new Double[9];
		numbers[0] = new Double(i1);
		numbers[1] = new Double(i2);
		numbers[2] = new Double(i3);
		numbers[3] = new Double(i4);
		numbers[4] = new Double(i5);
		numbers[5] = new Double(i6);
		numbers[6] = new Double(i7);
		numbers[7] = new Double(i8);
		numbers[8] = new Double(i9);
		
		Arrays.sort(numbers);
		
		for (int loop = 0; loop < numbers.length; loop++) 
			System.out.println(numbers[loop]);
	}

}
