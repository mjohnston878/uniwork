/**
 * 
 */
package areaOfAShape;

/**
 * @author matthew
 *
 */
public class Circle extends Shape {

	
	// instance vars
	private double radius;
	/**
	 * default constructor
	 */
	public Circle() {

	}
	public Circle(double radius) {
		this.radius = radius;
	}
	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}
	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public void area() {
		System.out.println("Circle: "+(3.14*this.radius*2));
	}
	
}
