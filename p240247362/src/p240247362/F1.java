/**
 * 
 */
package p240247362;

/**
 * @author matthew
 *
 */
public class F1 extends Car{
	
	// instance vars
	private double area;
	
	
	
	
	// constructors
	public F1() {
		
	}

	public F1(String make, String model, int horsePower, double area) {
		super(make, model, horsePower);
		this.area = area;
	}
	
	
	
	
	// getters and setters
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
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "F1 [area=" + area + ", getMake()=" + getMake() + ", getModel()=" + getModel() + ", getHorsePower()="
				+ getHorsePower() + "]";
	}
	
	public void displayAll() {
		System.out.println("F1 Car");
		super.displayAll();
		System.out.println("Area: \t"+this.area);
	}
	
	
	
}
