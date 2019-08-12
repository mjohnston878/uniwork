/**
 * 
 */
package payroll;

/**
 * @author matthew
 *
 */
public class Employee implements IPayable {

	private String name;
	
	/**
	 * 
	 */
	public Employee() {
	}
	
	
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


	@Override
	public double calculateWages(double hoursWorked, double payRate) {
		return hoursWorked * payRate;
	}

}
