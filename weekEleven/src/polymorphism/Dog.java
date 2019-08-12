/**
 * 
 */
package polymorphism;

/**
 * @author matthew
 *
 */
public class Dog extends Animal {
	/**
	 * method to show the noise a dog makes
	 */
	@Override
	public void makeNoise() {
		System.out.println("Dog goes woof");
	}
}
