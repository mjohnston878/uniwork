/**
 * 
 */
package methods;

import java.util.Calendar;

/**
 * @author matthew
 *
 */
public class CurrentTime {
	
	public static void currentTime() {
		Calendar now = Calendar.getInstance();
		
		int hour ;
		hour = now.get(Calendar.HOUR_OF_DAY);
		
		if (hour <= 11) {
			System.out.println("Good Morning");
		} else {
			System.out.println("I hope the morning went well, enjoy the rest of your day.  ");
		}
	}
	
	public static void main(String[] args) {
		currentTime();
	}

}
