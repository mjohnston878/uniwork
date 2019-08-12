/**
 * 
 */
package dryRunP2;

/**
 * @author matthew
 *
 */
public class RallyCar extends Car {

	
	private double area;
	
	/**
	 * 
	 */
	public RallyCar() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param make
	 * @param model
	 * @param horsePower
	 */
	public RallyCar(String make, String model, int horsePower, double area) {
		super(make, model, horsePower);
		this.area = area;
	}

	/**
	 * @return the area
	 */
	public double getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(double area) {
		this.area = area;
	}

	/* (non-Javadoc)
	 * @see dryRunP2.Car#displayAll()
	 */
	@Override
	public void displayAll() {
		System.out.println("Rally Car");
		super.displayAll();
		System.out.println("Area \t:"+this.area);
	}
	
	

}
