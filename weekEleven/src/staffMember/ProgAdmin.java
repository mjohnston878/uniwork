/**
 * 
 */
package staffMember;

/**
 * @author matthew
 *
 */
public class ProgAdmin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		StaffMember sm1 = new StaffMember();
		sm1.setFirstName("Bill");
		sm1.setLastName("Gates");
		
		Programmer p1 = new Programmer();
		p1.setLanguage("Java");
		
		System.out.println(sm1.toString());
		System.out.println(p1.toString());
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ProgAdmin [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
