/**
 * 
 */
package interfaces;

/**
 * @author matthew
 *
 */
public class Reader extends Employee implements IPayable {

	/**
	 * 
	 */
	public Reader() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see interfaces.IPayable#payWage(double, double)
	 */
	@Override
	public void payWage(double hours, double rate) {
		
		System.out.println("Reader wage: "+hours*rate*4.1);
	}

}
