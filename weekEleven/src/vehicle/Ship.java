/**
 * 
 */
package vehicle;

/**
 * @author matthew
 *
 */
public class Ship extends Vehicle {

	// instance vars
	private int tonnage;

	// constructors
	public Ship() {

	}

	public Ship(String name, String powerType, int tonnage) {
		super(name, powerType);
		this.tonnage = tonnage;
	}

	/**
	 * @return the tonnage
	 */
	public int getTonnage() {
		return tonnage;
	}

	// getters and setters
	/**
	 * @param tonnage the tonnage to set
	 */
	public void setTonnage(int tonnage) {
		this.tonnage = tonnage;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ship [tonnage=" + tonnage + ", getName()=" + getName() + ", getPowerType()=" + getPowerType()
				+ ", toString()=" + super.toString() + "]";
	}



}
