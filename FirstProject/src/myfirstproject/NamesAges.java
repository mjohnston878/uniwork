/**
 * 
 */
package myfirstproject;

/**
 * @author matthew
 *
 */ 
public class NamesAges {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//declares string for names
		
		String name1;
		String name2;
		String name3;
		String name4;
		
		//declare ints for ages
		int age1;
		int age2;
		int age3;
		int age4;
		
		int addition; 
		double averageAge;
		
		//initialise names
		name1 = "Matt";
		name2 = "Ricky";
		name3 = "Tim";
		name4 = "Drew";
		
		// initialise ages
		age1 = 26;
		age2 = 27;
		age3 = 29;
		age4 = 27;
		
		System.out.println(name1 + "s age is: " +age1);
		System.out.println(name2 + "s age is: " +age2);
		System.out.println(name3 + "s age is: " +age3);
		System.out.println(name4 + "s age is: " +age4);

		addition = age1 + age2 + age3 + age4;
		averageAge = addition / 4;
		
		System.out.println("\nAverage "+ averageAge);
		
		if (age1<averageAge) {
			
			System.out.println("Matt is younger than average");
		}
		
		
	}

}
