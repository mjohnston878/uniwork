package math.examples;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestEmployee {
	
	// set up data
	int validAge = 20;
	String validName = "Aidan";

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testName() {
		Employee e = new Employee();
		e.setName("Aidan");
		assertEquals("Aidan", e.getName());
		
	}
	
	@Test
	public void testSetValidAge() throws Exception {
		
		int validLower, validMid, validUpper;
		validLower = 18;
		validMid = 24;
		validUpper = 30;
		
		
		Employee e = new Employee();
		
		e.setAge(validLower);
		assertEquals(validLower, e.getAge());
		
		
		e.setAge(validMid);
		assertEquals(validMid, e.getAge());
		
		
		e.setAge(validUpper);
		assertEquals(validUpper, e.getAge());
	}
	
	@Test (expected=Exception.class)
	public void testInvalidAgeLower() throws Exception {
		int invalidAgeLower = 17;
				
		Employee e = new Employee();
		e.setAge(invalidAgeLower);
	}
	
	@Test (expected = Exception.class)
	public void testInvalidAgeUpper() throws Exception {
		int invalidAgeUpper = 31;
		
		Employee e = new Employee();
		e.setAge(invalidAgeUpper);
	}
	
	
	@Test 
	public void testConstructorArgs() throws Exception {
		
		int validAge = 20;
		String validName = "InvalidName";
		
		Employee e = new Employee(validName, validAge);
		
		assertEquals(validName, e.getName());
		assertEquals(validAge, e.getAge());
		
	}
	
	@Test (expected=Exception.class)
	public void testConstructorInvalidArgs() throws Exception {
		int validAge = -5;
		String validName = "ValidName";
		
		Employee e = new Employee(validName, validAge);
		
		assertEquals(validName, e.getName());
		assertEquals(validAge, e.getAge());
	}
		
	
}

