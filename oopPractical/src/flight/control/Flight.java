/**
 * 
 */
package flight.control;

/**
 * class showing flights
 * 
 * @author matthew
 *
 */
public class Flight {

	// instance vars
	private String flightNumber;
	private String destination;
	private String origin;
	private double duration;

	/**
	 * default constructor
	 */
	public Flight() {

	}
	/**
	 * Constructor with arguments 
	 * @param flightNumber
	 * @param destination
	 * @param origin
	 * @param duration
	 */
	public Flight(String flightNumber, String destination, String origin, double duration) {
		this.flightNumber = flightNumber;
		this.destination = destination;
		this.origin = origin;
		this.setDuration(duration);
	}

	// other methods
	/**
	 * @return the flightNumber
	 */
	public String getFlightNumber() {
		return flightNumber;
	}

	/**
	 * @param flightNumber the flightNumber to set
	 */
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * @return the duration
	 */
	public double getDuration() {
		return duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(double duration) {
		
		if (duration<=18) {
			this.duration = duration;
		} else {
			this.duration = 0;
			System.out.println("Invalid duration..");
		}
	}

	/*
	 * This is an overridden toString method
	 */
	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", destination=" + destination + ", origin=" + origin
				+ ", duration=" + duration + "]";
	}

}
