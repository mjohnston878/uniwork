/**
 * 
 */
package oOPRevision;

/**
 * @author matthew
 *
 */
public class Surgeon extends Employee {

	private String specialistArea;
	private double consultationFee;
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 */
	public Surgeon(String firstName, String lastName, double baseRate, String specialistArea, double consultationFee) {
		super(firstName, lastName, baseRate);
		this.specialistArea = specialistArea;
		this.consultationFee = consultationFee;
	}

	/**
	 * 
	 */
	public Surgeon() {
		// TODO Auto-generated constructor stub
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
	 * @see oOPRevision.Employee#calculateWeeklySalary(double)
	 */
	@Override
	public void calculateWeeklySalary(double hours) {
		// TODO Auto-generated method stub

	}

}
