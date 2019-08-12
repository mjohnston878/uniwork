/**
 * 
 */
package oop;

/**
 * @author matthew
 *
 */
public class TeamAdmin {

	/**
	 * creating a footballer
	 * @param args
	 */
	public static void main(String[] args) {
		
		// set
		Footballer f1 = new Footballer();
		f1.setfName("Gareth");
		f1.setlName("Bale");
		f1.setSquadNumber(9);
		f1.setEmployeeNumber(122324);
		
		// get
		System.out.println(f1.getfName());
		System.out.println(f1.getlName());
		System.out.println("Squad number "+f1.getSquadNumber());
		System.out.println("Employee number"+f1.getEmployeeNumber());
		
		System.out.println(f1.toString());
		
		Footballer f2 = new Footballer("Leo", "Messi", 10, 2323);
		System.out.println(f2.toString());
		}
	

		

}
