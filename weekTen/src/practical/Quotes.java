/**
 * 
 */
package practical;

/**
 * @author matthew
 * this class will output to screen several literacy quotes
 */
public class Quotes {
	
	/**
	 * this method outputs a shakespeare qoute
	 */
	public void shakespeareQuote() {
		System.out.println("Good night, good night, parting is such sweet sorrow, that i shall say goodnight till it be morrow.  Shakespeare");
	}

	public void wildeQuote() {
		System.out.println("Experience is simply the name we give our mistakes.  Wilde");
	}
	
	
	public static void main (String args []) {
		
		Quotes quotes = new Quotes();
		quotes.shakespeareQuote();
		quotes.wildeQuote();
		
	}
}
