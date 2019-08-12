/**
 * 
 */
package abstraction1;

/**
 * @author matthew
 *
 */
public class Builder extends Employee {
	
	private int builderID;

	/**
	 * @return the builderID
	 */
	public int getBuilderID() {
		return builderID;
	}

	/**
	 * @param builderID the builderID to set
	 */
	public void setBuilderID(int builderID) {
		this.builderID = builderID;
	}

	@Override
	public void calculateSalary(int rate, int hours) {
		System.out.println(rate * hours * 2.2); 
		
	}
	
	

}
