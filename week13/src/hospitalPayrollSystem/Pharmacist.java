/**
 * 
 */
package hospitalPayrollSystem;

/**
 * @author matthew
 *
 */
public class Pharmacist extends Employee {

	// instance vars
	private int grade;
	private double bonus;
	
	
	/**
	 * 
	 */
	public Pharmacist() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 */
	public Pharmacist(String firstName, String lastName, double baseRate, int grade, double bonus) {
		super(firstName, lastName, baseRate);
		this.grade = grade;
		this.bonus = bonus;
	}

	
	
	/**
	 * @return the grade
	 */
	public int getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(int grade) {
		this.grade = grade;
	}

	/**
	 * @return the bonus
	 */
	public double getBonus() {
		return bonus;
	}

	/**
	 * @param bonus the bonus to set
	 */
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	

	/* (non-Javadoc)
	 * @see hospitalPayrollSystem.Employee#printAll()
	 */
	@Override
	public void printAll() {
		// TODO Auto-generated method stub
		super.printAll();
		System.out.printf(" Grade: ", this.grade, " Bonus: ", this.bonus);
	}

	/* (non-Javadoc)
	 * @see hospitalPayrollSystem.Employee#calculateSalary(double)
	 */
	@Override
	public void calculateSalary(double hours) {
		System.out.println(hours * this.getBaseRate() + this.getBonus());
	}

}
