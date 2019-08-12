/**
 * 
 */
package polymorphism;

/**
 * @author matthew
 *
 */
public class PayrollManager  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		e1.setName("Joe Soap");
		e1.setJobTitle("Cleaner");
		
		e1.displayAll();
		e1.calculateWages(40);
		
		Researcher r1 = new Researcher();
		r1.setName("Jim");
		r1.setJobTitle("Researcher");
		r1.setSchool("EEECS");
		
		Lecturer l1 = new Lecturer();
		l1.setName("Aiden");
		l1.setJobTitle("Lecturer");
		l1.setSubject("CS");
		
	}
		public static void processWages(Employee[] employees) {
			for (Employee employee : employees) {
				employee.calculateWages(40);
			}
		}
}
