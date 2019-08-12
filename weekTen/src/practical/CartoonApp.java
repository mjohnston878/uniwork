/**
 * 
 */
package practical;

/**
 * @author matthew
 *
 */
public class CartoonApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// test bart
		SimpsonsCharacter bart = new SimpsonsCharacter();
		bart.setName("Bart");
		bart.setCatchPhrase("Eat my shorts");
		
		System.out.println(bart.getName()+" says: " +bart.getCatchPhrase());
		
		bart.sayCatchPhrase();
		
		//test homer
		SimpsonsCharacter homer = new SimpsonsCharacter();
		homer.setName("Homer");
		homer.setCatchPhrase("D'oh");
		
		homer.sayCatchPhrase();
	}
	

}
