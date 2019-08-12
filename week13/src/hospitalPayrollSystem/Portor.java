/**
 * 
 */
package hospitalPayrollSystem;

/**
 * @author matthew
 *
 */
public class Portor extends Employee {
	
	private String site;

	/**
	 * 
	 */
	public Portor() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 */
	public Portor(String firstName, String lastName, double baseRate, String site) {
		super(firstName, lastName, baseRate);
		this.site = site;
		
	}

	
	

	/**
	 * @return the site
	 */
	public String getSite() {
		return site;
	}

	/**
	 * @param site the site to set
	 */
	public void setSite(String site) {
		this.site = site;
	}
	
	
	

	/* (non-Javadoc)
	 * @see hospitalPayrollSystem.Employee#printAll()
	 */
	@Override
	public void printAll() {
		super.printAll();
		System.out.printf(" Site: ", this.site);
		
	}

	/* (non-Javadoc)
	 * @see hospitalPayrollSystem.Employee#calculateSalary(double)
	 */
	@Override
	public void calculateSalary(double hours) {
		System.out.println(hours * this.getBaseRate());
	}

}
