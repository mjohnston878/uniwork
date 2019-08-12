/**
 * 
 */
package youtubeTutorial2;

/**
 * @author matthew
 *
 */
public class Zoo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Bird bird1 = new Bird(3, "Female", 10);
		bird1.eat();
		bird1.sleep();

		Animal sparrow1 = new Sparrow(1, "male", 4);
		//sparrow1.move();

		Animal fish1 = new Fish(1, "Male", 2);
		//fish1.move();
		
		moveAnimal(fish1);
		
		moveAnimal(sparrow1);

	}
	
	public static void moveAnimal(Animal animal) {
		animal.move();
	}

}
