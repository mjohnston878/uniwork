/**
 * 
 */
package areaOfAShape;

/**
 * @author matthew
 *
 */
public class Triangle extends Shape {

	// instance vars
	private double base;
	private double height;
	
	
	/**
	 * default constructor
	 */
	public Triangle() {

	}

	/**
	 * constructor with args
	 * @param base
	 * @param height
	 */
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	/**
	 * @return the base
	 */
	public double getBase() {
		return base;
	}

	/**
	 * @param base the base to set
	 */
	public void setBase(double base) {
		this.base = base;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public void area() {
		System.out.println("Triangle: "+this.height*this.base / 2);
	}
	
}
