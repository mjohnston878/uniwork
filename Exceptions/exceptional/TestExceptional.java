import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import exceptional.Exceptional;

public class TestExceptional {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testDoubleUp() {

		Exceptional exceptional = new Exceptional();
		assertEquals(4, exceptional.doubleUp(2));
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void testDoubleUpException() {
		Exceptional exceptional = new Exceptional();
		// outcome is an exception
		exceptional.doubleUp(-4);
	}

}
