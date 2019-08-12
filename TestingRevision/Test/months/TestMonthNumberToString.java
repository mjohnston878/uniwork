package months;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMonthNumberToString {

	String one, two, three;
	
	@Before
	public void setUp() throws Exception {
		one = "Jan";
		two = "Feb";
		three = "Mar";
	}

	@Test 
	public void testMonthToString() {
		assertEquals(one, monthNumberToString.monthToString(1));
		assertEquals(two, monthNumberToString.monthToString(2));
		assertEquals(three, monthNumberToString.monthToString(3));
	}
	
	@Test (expected=NumberFormatException.class)
	public void testMonthUnknown() {
		assertEquals("xxx", monthNumberToString.monthToString(-1));
	}

}
