/**
 * 
 */
package polymorphism;

/**
 * @author matthew
 *
 */
public class Researcher extends Employee {
	
	private String school;

	/**
	 * @return the school
	 */
	public String getSchool() {
		return school;
	}

	/**
	 * @param school the school to set
	 */
	public void setSchool(String school) {
		this.school = school;
	}
	
	@Override
	public void calculateWages(int hoursWorked) {
		double wages = hoursWorked*getBasePay() * 10.2;
		displayAll();
		System.out.println("Wages: "+wages);
	
	
	
	

	}
}
	
