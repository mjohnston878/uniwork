/**
 * 
 */
package vehicle;

/**
 * @author matthew
 *
 */
public class Car extends Vehicle {
	// instance vars
	private int numberOfWheels;
	
	//constructors
	public Car() {
		
	}
	
	public Car(String name, String powerType, int numberOfWheels) {
		super (name, powerType);
		this.numberOfWheels = numberOfWheels;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car [numberOfWheels=" + numberOfWheels + "]";
	}
	
	
}
