package oOPRevision;

public class Pharmacist extends Employee {
	
	private int grade;
	private double bonus;
	
	
	//default constructor
	public Pharmacist() {
	}

	
	/**
	 * Constructor with arguments
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 * @param grade
	 * @param bonus
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
	 * @see oOPRevision.Employee#printAll()
	 */
	@Override
	public void printAll() {
		System.out.println("Pharmacist", this.getFirstName(), this.getLastName(), this.getBaseRate(),this.grade ,this.bonus);
	}


	@Override
	public void calculateWeeklySalary(double hours) {
		
		System.out.println("Pharmacist:", this.getFirstName(), this.getLastName(), hours, this.getBaseRate(), this.getBonus(),  (hours*this.getBaseRate(), + this.bonus)));
	}

}
