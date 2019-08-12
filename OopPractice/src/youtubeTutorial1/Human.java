/**
 * 
 */
package youtubeTutorial1;

/**
 * @author matthew
 *
 */
public class Human {
	
	String name;
	int age;
	int heightInInches;
	String eyeColour;
	
	public Human() {
		
		
	}
	
	
	
	public Human(String name, int age, int heightInInches, String eyeColour) {
		super();
		this.name = name;
		this.age = age;
		this.heightInInches = heightInInches;
		this.eyeColour = eyeColour;
	}



	public void speak(){
		System.out.println("Hello, my name is " +name);
		System.out.println("I am "+ heightInInches + " inches tall.");
		System.out.println("I am " + age + "  years old.");
		System.out.println("My eyes are " + eyeColour);
		System.out.println("");
	}
	
	public void eat() {
		System.out.println("Eating...");
	}
	
	public void walk() {
		System.out.println("Walking...");
	}
	
	public void work() {
		System.out.println("Working...");
	}
}
