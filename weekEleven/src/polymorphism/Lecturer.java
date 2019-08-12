/**
 * 
 */
package polymorphism;

/**
 * @author matthew
 *
 */
public class Lecturer extends Employee {
	
	
	// instance vars
	private String subject;

	
	/* (non-Javadoc)
	 * @see polymorphism.Employee#calculateWages(int)
	 */
	@Override
	public void calculateWages(int hoursWorked) {
		double wages = hoursWorked*getBasePay() * 20.2;
		displayAll();
		System.out.println("Wages: "+wages);
	}

	// methods - getters and setters
	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	

}
