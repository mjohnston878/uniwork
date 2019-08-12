package math.examples;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMonthNumberToString {
	// test data
	int one = 1;
	
	String monthOne = "Jan";
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMonthNumberToStringValid() {
		
		assertEquals(monthOne, monthNumberToString.numberToMonth(one));
		assertEquals("Feb", monthNumberToString.numberToMonth(2));
		assertEquals("Mar", monthNumberToString.numberToMonth(3));
		}
	
	
	@Test(expected=NumberFormatException.class)
	public void testMonthNumberToStringInvalid() {
		int zero = 0;
		
		monthNumberToString.numberToMonth(zero);
	
	}

}
