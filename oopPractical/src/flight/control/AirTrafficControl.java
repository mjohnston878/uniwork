/**
 * 
 */
package flight.control;

/**
 * @author matthew
 *
 */
public class AirTrafficControl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Flight f1 = new Flight();
		f1.setFlightNumber("ESY3214");
		f1.setOrigin("Amsterdam");
		f1.setDestination("Belfast");
		f1.setDuration(2.2);
		
		
		Flight f2 = new Flight("BA127", "London Heathrow", "Cape Town", 11.5);
		Flight f3 = new Flight("AE999", "Dublin", "New York JFK", 7.5);
		Flight f4 = new Flight("ESY3214", "New York", "Dublin", 8.5);
		
		
		System.out.println("All flight info");
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println(f3.toString());
		System.out.println(f4.toString());
		
		Flight [] flights = {f1, f2, f3, f4} ;
		
		System.out.println("All flights from an array output loop");
		for (int loop = 0; loop < flights.length; loop++) {
			System.out.println(flights[loop].toString()); 
		}
		
		
		double longestFlight = flights[0].getDuration();
		for (int loop = 0; loop < flights.length; loop++) {
			if (flights[loop].getDuration() > longestFlight) {
				// new longest flight duration found
				longestFlight = flights[loop].getDuration();
			}
		}
		
		System.out.println("The longest flight duration: "+longestFlight);
		
		
		
		System.out.println("All fights from Dublin:");
		// all flights from dublin
		for (int loop = 0; loop < flights.length; loop++) {
			if (flights[loop].getOrigin().equalsIgnoreCase("Dublin")) {
				// output the flight number of this flight from Dublin
				System.out.println(flights[loop].getFlightNumber());
			}
		}
		
		// attempting to add a flight with an invalid duration >=18
		Flight f5 = new Flight("AUS12", "Beijing", "Paris", 18.1);
		System.out.println(f5.toString());
		
	}

}
