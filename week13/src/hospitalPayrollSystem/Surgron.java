/**
 * 
 */
package hospitalPayrollSystem;

/**
 * @author matthew
 *
 */
public class Surgron extends Employee {
	
	private String specialistArea;
	private double consultationFee;
	
	

	/**
	 * 
	 */
	public Surgron() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 */
	public Surgron(String firstName, String lastName, double baseRate, String specialistArea, double consultationFee) {
		super(firstName, lastName, baseRate);
		this.specialistArea = specialistArea;
		this.consultationFee = consultationFee;
	}

	
	
	/**
	 * @return the specialistArea
	 */
	public String getSpecialistArea() {
		return specialistArea;
	}

	/**
	 * @param specialistArea the specialistArea to set
	 */
	public void setSpecialistArea(String specialistArea) {
		this.specialistArea = specialistArea;
	}

	/**
	 * @return the consultationFee
	 */
	public double getConsultationFee() {
		return consultationFee;
	}

	/**
	 * @param consultationFee the consultationFee to set
	 */
	public void setConsultationFee(double consultationFee) {
		this.consultationFee = consultationFee;
	}

	
	
	/* (non-Javadoc)
	 * @see hospitalPayrollSystem.Employee#printAll()
	 */
	@Override
	public void printAll() {
		super.printAll();
		System.out.printf(" Specialist Area: ", this.specialistArea, "Consultation fee: ", this.consultationFee);
	}

	/* (non-Javadoc)
	 * @see hospitalPayrollSystem.Employee#calculateSalary(double)
	 */
	@Override
	public void calculateSalary(double hours ) {
		System.out.println(hours * this.getBaseRate() + this.getConsultationFee());
	}

}
