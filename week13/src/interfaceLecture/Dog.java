/**
 * 
 */
package interfaceLecture;

/**
 * @author matthew
 *
 */
public class Dog implements IAnimal{

	/**
	 * 
	 */
	public Dog() {
		
	}

	@Override
	public void move() {
		System.out.println("Walking with owner");
	}

	@Override
	public void eat() {
		System.out.println("Eating a bone");
	}

}
