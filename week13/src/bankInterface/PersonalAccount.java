/**
 * 
 */
package bankInterface;

/**
 * @author matthew
 *
 */
public class PersonalAccount extends BankAccount {

	private String firstName;
	private String lastName;
	
	/**
	 * 
	 */
	public PersonalAccount() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void displayAll() {
		
	}
}
