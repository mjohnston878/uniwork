/**
 * 
 */
package staffMember;

/**
 * @author matthew
 *
 */
public class HospitalAdmin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		StaffMember sm1 = new StaffMember("Joe", "Bloggs");
		//sm1.setFirstName("Paul");
		//sm1.setLastName("Paulson");

		Doctor d1 = new Doctor();
		d1.setWard(23);
		d1.setFirstName("DR");
		d1.setLastName("Scrub");
		
		Doctor d2 = new Doctor("Dr", "Dolittle", 999);
		
		System.out.println(sm1.toString());
		System.out.println(d1.toString());
		System.out.println(d2.toString());
	}
	
}
