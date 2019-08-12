/**
 * 
 */
package canivote;

//import statements

import java.util.Scanner;

/**
 * @author matthew
 * method to decide if old enough to vote
 */
public class canIVote {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//declare vars
		
		int voteAge;
		voteAge = 18;
		
		Scanner scanner = new Scanner(System.in);
		
		//declare if statement
		if (voteAge >= 18) {
		System.out.println("Yes, you are old enough to vote.");
		
		} //end of if statement
		
		//declare if statement
		if (voteAge < 18 ) {
		System.out.println("No, you are not old enough to vote.");
		
		}//end of if statement
	
		scanner.close(); //close scanner

	}

}
