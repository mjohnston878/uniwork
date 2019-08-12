/**
 * 
 */
package practical6;

/**
 * @author matthew
 *
 */
public class Practical6Part8Arrays {

	public static void assignmentAnalyser(int[] assign1, int[] assign2) {

		double average1, average2;

		// calculate the total for assignment 1
		average1 = (double) totalMarks(assign1) / assign1.length;
		// calculate the total for assignment 2
		average2 = (double) totalMarks(assign2) / assign2.length;
		
		System.out.printf("Average mark for assignment 1: %.1f \n",+average1);
		
		System.out.printf("Average mark for assignment 2: %.1f \n",+average2);
		
		System.out.printf("Overall average %.1f \n", (average1+average2) / 2);
		
		if(average1 > average2) {
			System.out.println("Assignment 1 has the highest average.");
		} else  if(average1 < average2){
			System.out.println("Assignemt 2 has the highest average.");
		} else {
			System.out.println("Both averages are the same.");
		}
	}

	public static int totalMarks(int[] results) {
		int total = 0;

		for (int loop = 0; loop < results.length; loop++) {
			total += results[loop];
		}
		return total;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] assignment1 = { 24, 42, 29, 66, 77 };
		int[] assignment2 = { 79, 68, 31, 22, 42 };

		assignmentAnalyser(assignment1, assignment2);
	}

}
