/**
 * 
 */
package areaOfAShape;

/**
 * @author matthew
 *
 */
public class ShapeFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Shape shape = new Shape();
		
		Shape r = new Rectangle(2,4);
		
		Shape c = new Circle(3.1);
		
		calculateArea(r);
		calculateArea(c);
		
		Shape[] shapes = new Shape[3];
		shapes[0] = shape;
		shapes[1] = r;
		shapes[2] = c;
		
		calculateArea(shapes);

	}
	
	public static void calculateArea(Shape s) {
		s.area();
	}
	public static void calculateArea(Shape[] shapes) {
		for(Shape s : shapes) {
			if(s!=null) {
				s.area();
			}
		}
	}
}
