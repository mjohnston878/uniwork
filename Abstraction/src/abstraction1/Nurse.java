/**
 * 
 */
package abstraction1;

/**
 * @author matthew
 *
 */
public class Nurse extends Employee {

	/* (non-Javadoc)
	 * @see abstraction1.Employee#calculateSalary(int, int)
	 */
	@Override
	public void calculateSalary(int rate, int hours) {
		System.out.println(rate * hours * 3.5);
	}

}
