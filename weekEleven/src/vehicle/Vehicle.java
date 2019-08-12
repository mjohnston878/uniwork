/**
 * 
 */
package vehicle;

/**
 * @author matthew
 *
 */
public class Vehicle {
	// instance vars
	private String name;
	private String powerType;
	
	// constructors
	public Vehicle() {
		
	}
	
	public Vehicle(String name, String powerType) {
		this.name = name;
		this.powerType = powerType;
	}

	
	//getters and setters
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the powerType
	 */
	public String getPowerType() {
		return powerType;
	}

	/**
	 * @param powerType the powerType to set
	 */
	public void setPowerType(String powerType) {
		this.powerType = powerType;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", powerType=" + powerType + "]";
	}
	
	
	
	
	
	
	}


