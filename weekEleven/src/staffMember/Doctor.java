/**
 * 
 */
package staffMember;

/**
 * @author matthew
 *
 */
public class Doctor extends StaffMember {
	
	// insrance vars
	private int ward;

	
	// constructors
	/**
	 * default constructor
	 */
	public Doctor() {
		
	}
	/**
	 * constructors with arguments
	 * @param firstName
	 * @param lastName
	 * @param ward
	 */
	public Doctor(String firstName, String lastName, int ward) {
		
		super(firstName, lastName);

		//this.setFirstName(firstName);
		//this.setLastName(lastName);
		this.ward = ward;
		
	}
	/**
	 * @return the ward
	 */
	public int getWard() {
		return ward;
	}

	/**
	 * @param ward the ward to set
	 */
	public void setWard(int ward) {
		this.ward = ward;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Doctor [ward=" + ward + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + "]";
	}
	
	
	
	

}
