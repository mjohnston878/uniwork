/**
 * 
 */
package practical;

/**
 * @author matthew
 *
 */
public class SimpsonsCharacter {
	
	// instance vars
	private String name;
	private String catchPhrase;
	
	
	
	
	// constructors
	
	/**
	 * default constructor
	 */
	public SimpsonsCharacter() {
		
	}
	
	

	/**
	 * constructor with args for name and catchPhrase
	 * @param name
	 * @param catchPhrase
	 */
	public SimpsonsCharacter(String name, String catchPhrase) {
		this.name = name;
		this.catchPhrase = catchPhrase;
	}




	// methods

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}




	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}




	/**
	 * @return the catchPhrase
	 */
	public String getCatchPhrase() {
		return catchPhrase;
	}




	/**
	 * @param catchPhrase the catchPhrase to set
	 */
	public void setCatchPhrase(String catchPhrase) {
		this.catchPhrase = catchPhrase;
	}
	
	public void sayCatchPhrase() {
		System.out.println(this.name +" says "+ this.catchPhrase);
		
	}
	

	
	
}
