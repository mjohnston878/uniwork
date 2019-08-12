/**
 * 
 */
package vehicle;

/**
 * @author matthew
 *
 */
public class VehicleBuilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car c1 = new Car("Toyota", "All the power", 4);
		
		Ship s1 = new Ship("BoatyMcBoatFace", "TurtlePower", 6789);
		
		System.out.println(c1.toString());
		
		System.out.println(s1.toString());
		
	}

}
