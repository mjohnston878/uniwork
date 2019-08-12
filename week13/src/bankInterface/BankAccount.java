/**
 * 
 */
package bankInterface;

/**
 * @author matthew
 *
 */
public abstract class BankAccount {
	
	private int accNumber;
	private double balance;
	
	

	/**
	 * 
	 */
	public BankAccount() {
		// TODO Auto-generated constructor stub
	}



	/**
	 * @return the accNumber
	 */
	public int getAccNumber() {
		return accNumber;
	}



	/**
	 * @param accNumber the accNumber to set
	 */
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}



	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}



	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void displayAll() {
		System.out.println("Account number:"+ this.getAccNumber());
		System.out.println("Balance: "+ this.getBalance());
	}
}
