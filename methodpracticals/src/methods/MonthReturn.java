/**
 * 
 */
package methods;

/**
 * @author matthew
 *
 */
public class MonthReturn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
	System.out.println("Your month is: " +nameOfMonth(5));
		
	}
	
	/**
	 * Method show month to corresponding number given
	 * @param month
	 * @return Shows number entered as corresponding month
	 */
	public static String nameOfMonth (int month) {
		
		
		String name = null;
		
		switch (month) {
		case 1:
			name = "January";
			break;
		case 2:
			name = "February";
			break;
		case 3:
			name = "March";
			break;
		case 4:
			name = "April";
			break;
		case 5:
			name = "May";
			break;
		case 6:
			name = "June";
			break;
		case 7:
			name = "July";
			break;
		case 8:
			name = "August";
			break;
		case 9:
			name = "September";
			break;
		case 10:
			name = "October";
			break;
		case 11:
			name = "November";
			break;
		case 12:
			name = "December";
			break;
		default:
			System.out.println("Invalid Number");
		}
		
		return name;
	}
	
}
