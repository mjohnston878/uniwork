/**
 * 
 */
package practical6;

/**
 * @author matthew
 *
 */
public class Practical6Arrays {

	public static final double RATE = 10.25;

	public static void hoursAndWages(int[] hours) {

		int totalHours = 0;

		for (int day = 0; day < hours.length; day++) {
			System.out.printf("Day %d hours %d \n", (day + 1), hours[day]);
			totalHours += hours[day];
		}
		System.out.println("Total Hours:" + totalHours);
		System.out.printf("Total Salary: £%.2f ", (totalHours * RATE));

		// add up all hours worked (loop)

	}

	public static void main(String[] args) {

		int[] hours = { 8, 7, 9, 7, 4 };
		hoursAndWages(hours);
	}

}
