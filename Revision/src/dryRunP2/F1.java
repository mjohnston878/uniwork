/**
 * 
 */
package dryRunP2;

/**
 * @author matthew
 *
 */
public class F1 extends Car {

	
	private double area;
	
	/**
	 * 
	 */
	public F1() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param make
	 * @param model
	 * @param horsePower
	 */
	public F1(String make, String model, int horsePower, double area) {
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
		System.out.println("F1");
		super.displayAll();
		System.out.println("Area \t:"+this.area);
	}
	
	

}
