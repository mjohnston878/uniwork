package p2p40247362;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMp3 {

	// test data
	int refNumberValid, refNumberInvalid, ratingValid, ratingInvalidLower, ratingInvalidUpper;
	String songNameValid, songNameInvalid, artistValid, artistInvalid;

	@Before
	public void setUp() throws Exception {
		refNumberValid = 1;
		refNumberInvalid = -1;
		ratingValid = 2;
		ratingInvalidLower = 0;
		ratingInvalidUpper = 6;

		songNameValid = "validSongNamee";
		songNameInvalid = "invalidSongName";
		artistValid = "artistValid";
		artistInvalid = "artistInvalid";
	}

	/*
	 * Testing default constructor
	 */
	@Test
	public void testMp3ConstructorDefault() {
		mp3 myMp3 = new mp3();
		assertNotNull(myMp3);
	}

	@Test
	public void testMp3NonDefualtConstructor() {
		mp3 myMp3 = new mp3(refNumberValid, artistValid, songNameValid, ratingValid);
		assertNotNull(myMp3);

		// testing valid
		assertEquals(refNumberValid, myMp3.getRef());
		assertEquals(artistValid, myMp3.getArtist());
		assertEquals(songNameValid, myMp3.getSongName());
		assertEquals(ratingValid, myMp3.getRating());
	}

	@Test
	public void testSetRef() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetArtist() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetSongName() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSetRatingValidValuesUpperBoundry() {
		mp3 myMp3 = new mp3();
		myMp3.setRating(5);
		assertEquals(ratingValid, myMp3.getRating());
	}

	@Test
	public void testSetRatingValidValues() {
		mp3 myMp3 = new mp3();
		myMp3.setRating(ratingValid);
		assertEquals(ratingValid, myMp3.getRating());
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testSetRatingInvalidValuesLower() {
		mp3 myMp3 = new mp3();
		myMp3.setRating(ratingInvalidLower);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testSetRatingInvalidValuesUpper() {
		mp3 myMp3 = new mp3();
		myMp3.setRating(ratingInvalidUpper);
	}

}
