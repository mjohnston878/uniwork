/**
 * 
 */
package bankInterface;

/**
 * @author matthew
 *
 */
public class BusinessAccount extends BankAccount implements IPrintable {

	private String businessName;
	/**
	 * 
	 */
	public BusinessAccount() {
		// TODO Auto-generated constructor stub
	}

	
	
	/**
	 * @return the businessName
	 */
	public String getBusinessName() {
		return businessName;
	}



	/**
	 * @param businessName the businessName to set
	 */
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}



	@Override
	public void printStatement() {
		System.out.println("A printed statement will be posted to your address");
	}
	
	public void displayAll() {
		System.out.println("Business name:"+this.getBusinessName());
	}

}
