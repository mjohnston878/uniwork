/**
 * 
 */
package staffMember;

/**
 * @author matthew
 *
 */
public class Programmer extends StaffMember {
	private String language;

	
	// constructor
	public Programmer() {
		
	}
	
	public Programmer(String firstName, String lastName, String language) {
		super(firstName, lastName);
		this.language = language;
	}
	/**
	 * @return the language
	 */
	
	
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Programmer [language=" + language + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + "]";
	}
	
	
	

}
