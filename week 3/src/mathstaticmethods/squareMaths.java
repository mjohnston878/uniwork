/**
 * 
 */
package mathstaticmethods;
// import statement

import java.util.Scanner;

/**
 * @author matthew
 * Method about squares
 */
public class squareMaths {

	/**
	 * @param args
	 */
	//class about squares
	public static void main(String[] args) {
		
		//declare vars
		
		double squareSide;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number");
		
		squareSide = scanner.nextDouble();
		
		System.out.println("My perimiter is "+squareSide*4);
		
		System.out.println("My Area is "+(squareSide * squareSide) * Math.PI);
		
		scanner.close();

	}

}
