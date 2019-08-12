/**
 * 
 */
package hospitalPayrollSystem;

/**
 * @author matthew
 *
 */
public class PayrollManager {

	public static Employee[] employees = new Employee[6];

	public static int HOURS_PER_WEEK = 35;

	/**
	 * 
	 */
	public PayrollManager() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee porter1 = new Portor("Ivana", "Patient", 10.5, "Royal");
		Employee porter2 = new Portor("Amanda", "Pushabed", 10.5, "BCH");
		Employee surgeon1 = new Surgron("Jack", "Ripper", 55.25, "Renal", 650.00);
		Employee surgeon2 = new Surgron("Edward", "Lister", 55.25, "Vascular", 800.00);
		Employee pharmacist = new Pharmacist("Poppy", "Pill", 30.50, 7, 750);
		
		// call method to handle adding the employees to the list
		addEmployeeToList(porter1);
		addEmployeeToList(porter2);
		addEmployeeToList(surgeon1);
		addEmployeeToList(surgeon2);
		addEmployeeToList(pharmacist);
		
		// show all employees
		displayAllEmployees();
		System.out.println();
		
		// run payroll
		processWeeklyPayroll();
	}

	public static void addEmployeeToList(Employee employee) {
		for (int loop = 0; loop < employees.length; loop++) {
			if (employees[loop] == null) {
				// add employee to the empth array index
				employees[loop] = employee;
				break;
			}
		}
	}

	public static void displayAllEmployees() {
		System.out.println("Display all employees_______________________________");
		int totalEmployees = 0;
		System.out.printf("[%-10s] %-20s %-20s %-6s %s \n", "Type", "First Name", "Last Name", "Rate", "Other",
				"Consultation Fee");
		for (Employee e : employees) {
			if (e != null) {
				e.printAll();
				totalEmployees++;
				System.out.println(); // line break
			} else {
				// no more records so quit loop
				break;
			}
			System.out.println("Total employees in system: " + totalEmployees);
			System.out.println("___________________________________________________");
		}

	}

	public static void processWeeklyPayroll() {
		System.out.println("Payroll run... _____________________________________");
		int totalEmployees = 0;
		for (Employee e : employees) {
			if (e != null) {
				e.printAll();
				totalEmployees++;
				System.out.println(); // line break
			} else {
				// no more records so quit loop
				break;
			}
		}
		System.out.println("Total records processed: "+ totalEmployees);
		System.out.println("_____________________________________________________");
	}

}
