/**
 * 
 */
package oOPRevision;

/**
 * @author matthew
 *
 */
public class Porter extends Employee {

	
	private String site;
	
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param baseRate
	 */
	public Porter(String firstName, String lastName, double baseRate, String site) {
		super(firstName, lastName, baseRate);
		this.site = site; 
	}

	/**
	 * 
	 */
	public Porter() {
		// TODO Auto-generated constructor stub
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
	 * @see oOPRevision.Employee#printAll()
	 */
	@Override
	public void printAll() {
		System.out.printf("Site: ",this.getFirstName(), this.getLastName(),this.getBaseRate(),this.getSite());
	}

	/* (non-Javadoc)
	 * @see oOPRevision.Employee#calculateWeeklySalary(double)
	 */
	public void calculateWeeklySalary(double hours) {
		System.out.print(this.getFirstName(), this.getLastName(), "Porter: ", hours, this.getBaseRate(),(hours*this.getBaseRate()));
	}
	
	
	
	

}
