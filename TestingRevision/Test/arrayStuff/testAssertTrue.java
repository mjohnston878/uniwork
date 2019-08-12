package arrayStuff;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import calculator.NumberCruncher;

public class testAssertTrue {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public final void testDoubleUp() {
		int seed = 2;
		int number = 4;
		int[] expected = {2,4,8,16};
		
		AssertTrue assertTrue = new AssertTrue();
		int[] actual = assertTrue.doubleUp(seed, number);
		
		System.out.println(Arrays.toString(actual));
		boolean match = true;
		// checking the values of the actual are the same as expected
		for(int loop = 0; loop<expected.length; loop++) {
			if(expected[loop] == actual[loop]) {
				match = true;
			} else {
				// not a match
				match = false; //set flag to false
				break; // leaving the loop
			}
		}
		// overall result
		assertTrue(match);
	}

}
