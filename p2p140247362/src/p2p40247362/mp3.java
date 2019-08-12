package p2p40247362;

/*
 * Matthew Johnston
 * 40247362
 */
public class mp3 {

	/*
	 * Static method showing the Lower rating limit will remain as zero
	 */
	public final static int LOWER_RATING = 0;

	/*
	 * Reference number for mp3
	 */
	private int ref;

	/*
	 * Name of Artist of song for mp3
	 */
	private String artist;

	/*
	 * Song name of mp3
	 */
	private String songName;

	/*
	 * Rating of mp3 between 1 and 5
	 */
	private int rating;

	/*
	 * default constructor
	 */
	public mp3() {

	}

	/**
	 * constructor with arguments
	 * 
	 * @param ref
	 * @param artist
	 * @param songName
	 * @param rating
	 */
	public mp3(int ref, String artist, String songName, int rating) {
		this.ref = ref;
		this.artist = artist;
		this.songName = songName;
		this.setRating(rating);;
	}

	public int getRef() {
		return ref;
	}

	/**
	 * If less than zero then throw exception
	 * 
	 * @param ref
	 */
	public void setRef(int ref) throws IllegalArgumentException {

		if (ref <= 0) {
			this.ref = ref;
		}
		throw new IllegalArgumentException("Ref less than 0");
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public int getRating() {
		return rating;
	}
 
	/*
	 * Rating between 1 and 5
	 * throws exception
	 */
	public void setRating(int rating) throws IllegalArgumentException {
		if ((rating > LOWER_RATING) && (rating < 6)) {
			this.rating = rating;
		} else {
			throw new IllegalArgumentException("Value for ref outside range");
		}

	}

}
