/**
 * 
 */
package polymorphism;

/**
 * @author matthew
 *
 */
public class ZooFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Animal a1 = new Animal();
		a1.makeNoise();

		Animal dog = new Dog();
		dog.makeNoise();

		Animal lion = new Lion();
		lion.makeNoise();

		Animal[] animals = { a1, dog, lion };
		
		for (Animal animal : animals) {
			animal.makeNoise();
		}
		
		animalNoiseMaker(animals);
	}
	
	public static void animalNoiseMaker(Animal[] animals) {
		for (Animal a : animals) {
			a.makeNoise();
		}
	}

}
