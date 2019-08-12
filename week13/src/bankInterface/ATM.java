/**
 * 
 */
package bankInterface;

/**
 * @author matthew
 *
 */
public class ATM {

	/**
	 * 
	 */
	public ATM() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BusinessAccount ba = new BusinessAccount();
		ba.setAccNumber(101010);
		ba.setBalance(9999.34);
		ba.displayAll();
		
		ba.printStatement();
	}

}
