/**
 * 
 */
package areaOfAShape;

/**
 * @author matthew
 *
 */
public class Rectangle extends Shape {

	// instance vars
	
	private int width;
	private int height;
	
	/**
	 * default constructor
	 */
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public void area() {
		System.out.println("Rectangle: "+this.height*this.width);
	}
	
}
