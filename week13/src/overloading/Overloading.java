/**
 * 
 */
package overloading;

/**
 * @author matthew
 *
 */
public class Overloading {

	public static void square(int num) {
		System.out.println("In here with an int");
		System.out.println(num * num);
	}

	public static void square(double num) {
		System.out.println("In here with a double");
		System.out.println(num * num);
	}

	public static void main(String[] args) {
		square(34);
		square(3.4);
	}

}
