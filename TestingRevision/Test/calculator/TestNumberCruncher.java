package calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestNumberCruncher {

	// test data
	int num1, num2, num3;
	
	@Before
	public void setUp() throws Exception {
		num1 = 3;
		num2 = 4;
		num3 = 5;
	}

	@Test
	public void testAddNumbersIntInt() {
		
		int expected = num1+num2;
		NumberCruncher nc = new NumberCruncher();
		int actual = nc.addNumbers(num1, num2);
		assertEquals(expected, actual);
		
	}

	@Test
	public void testAddNumbersIntIntInt() {
		int expected = num1+num2+num3;
		NumberCruncher nc = new NumberCruncher();
		int actual = nc.addNumbers(num1, num2, num3);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testMultiplyNumbersIntInt() {
		
		int expected = num1*num2;
		NumberCruncher nc = new NumberCruncher();
		int actual = nc.multiplyNumbers(num1, num2);
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testMultiplyNumbersIntIntInt() {
		
		int expected = num1*num2*num3;
		NumberCruncher nc = new NumberCruncher();
		int actual = nc.multiplyNumbers(num1, num2, num3);
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testDivNumbersDoubleDouble() {
		NumberCruncher nc = new NumberCruncher();
		double expected = 3.33;
		assertEquals(expected, nc.divNumbers(10.0, 3.0), 0.1);
	}
	
	@Test
	public void testDivideNumbers() {
		NumberCruncher numberCruncher = new NumberCruncher();
		int num1D = 6;
		int num2D = 3;
		int expected = num1D/num2D;
		int actual = 0;
		try {
			actual = numberCruncher.divideNumbers(num1D, num2D);
			assertEquals(expected, actual);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
