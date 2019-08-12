/**
 * 
 */
package interfaceLecture;

/**
 * @author matthew
 *
 */
public class Lion implements IAnimal {

	/**
	 * 
	 */
	public Lion() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see interfaceLecture.IAnimal#move()
	 */
	@Override
	public void move() {
		System.out.println("Running fast..");
	}

	/* (non-Javadoc)
	 * @see interfaceLecture.IAnimal#eat()
	 */
	@Override
	public void eat() {
		System.out.println("Eats a zebra");
	}

}
