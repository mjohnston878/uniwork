/**
 * 
 */
package math.examples;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author matthew
 *
 */
public class TestNumberCruncher {

	// test data
	int num1, num2, num3;
	NumberCruncher numberCruncher;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {

		num1 = 2;
		num2 = 4;
		num3 = 6;

		numberCruncher = new NumberCruncher();

	}

	/**
	 * Test method for {@link math.examples.NumberCruncher#addNumbers(int, int)}.
	 */
	@Test
	public void testAddNumbersIntInt() {

		int expected = num1 + num2;

		int actual = numberCruncher.addNumbers(num1, num2);

		assertEquals(expected, actual);
	}

	/**
	 * Test method for
	 * {@link math.examples.NumberCruncher#addNumbers(int, int, int)}.
	 */
	@Test
	public void testAddNumbersIntIntInt() {

		int expected = num1 + num2 + num3;

		int actual = numberCruncher.addNumbers(num1, num2, num3);

		assertEquals(expected, actual);
	}

	@Test
	public void testMultiplyNumbersIntInt() {

		int expected = num1 * num2;

		int actual = numberCruncher.multiplyNumbers(num1, num2);

		assertEquals(expected, actual);
	}

	@Test
	public void testMultiplyNumbersIntIntInt() {

		int expected = num1 * num2 * num3;

		int actual = numberCruncher.multiplyNumbers(num1, num2, num3);

		assertEquals(expected, actual);
	}

	/**
	 * 0.1 is a delta, it tests the accuracy to 1 decimal place
	 * 
	 * @throws Exception
	 */
	@Test
	public void testDivNumbers() throws Exception {

		double excepted = 3.33;

		assertEquals(excepted, numberCruncher.divNumbers(10, 3), 0.1);

	}

	@Test(expected = Exception.class)
	public void testDivNumbersDivByZero() throws Exception {

		numberCruncher.divNumbers(10, 0);
	}

}
