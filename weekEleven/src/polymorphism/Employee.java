/**
 * 
 */
package polymorphism;

/**
 * @author matthew
 *
 */
public class Employee {
	
	// instance vars
	private String name;
	private String jobTitle;
	private double basePay = 30.00;
	
	
	
	
	
	// getters and setters methods
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
	 * @return the jobTitle
	 */
	public String getJobTitle() {
		return jobTitle;
	}
	/**
	 * @param jobTitle the jobTitle to set
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	/**
	 * @return the basePay
	 */
	public double getBasePay() {
		return basePay;
	}
	/**
	 * @param basePay the basePay to set
	 */
	public void setBasePay(double basePay) {
		this.basePay = basePay;
	}
	
	public void calculateWages (int hoursWorked) {
		double wages = hoursWorked*basePay;
		displayAll();
		System.out.println("Wages: "+wages);
	}

	
	public void displayAll() {
		System.out.println("Name: "+this.name);
		System.out.println("Job Title: "+this.jobTitle);
		System.out.println("Base PAy: "+this.basePay);
	}

}
