/**
 * 
 */
package oOPRevision;

/**
 * @author matthew
 *
 */
public abstract class Employee {
	
	// instance vars
	private String firstName;
	private String lastName;
	private double baseRate;
	
	
	// constructors
	
	/**
	 * Constructor with args
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 */
	public Employee(String firstName, String lastName, double baseRate) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.baseRate = baseRate;
	}

	
	/**
	 * Default constructor
	 */
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	// getters and setters
	
	
	
	public String getLastName() {
		return lastName;
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


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public double getBaseRate(double baseRate) {
		return baseRate;
	}
	
	public void setBaseRate(double baseRate) {
		this.baseRate = baseRate;
	}
	
	public abstract void calculateWeeklySalary(double hours);  
	
	public void printAll() {
		System.out.printf("Employee:", this.firstName, this.lastName, this.baseRate);
	}
	
	
	
}

