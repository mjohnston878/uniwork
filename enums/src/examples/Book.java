/**
 * 
 */
package examples;

/**
 * @author matthew
 *
 */
public class Book {

	private String title;
	private Genre genre;
	
	/**
	 * Default constructor
	 */
	public Book() {
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the genre
	 */
	public Genre getGenre() {
		return genre;
	}

	/**
	 * @param genre the genre to set
	 */
	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	
}
