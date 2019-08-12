/**
 * 
 */
package moreTesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author matthew
 *
 */
public class TestEmployee {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testName() {

		String expected = "Aidan";
		Employee employee = new Employee();
		employee.setName(expected);
		String actual = employee.getName();
		assertEquals(expected, actual);
	
	}

	@Test
	public void testAge() throws Exception {
		int expected = 20;
		Employee employee = new Employee();
		employee.setAge(expected);
		int actual = employee.getAge();
		assertEquals(expected, actual);
	}
	
	@Test (expected=Exception.class)
	public void testInvalidAge() throws Exception {
		int expected = 0;
		int testInvaldAge = 4;
		Employee employee = new Employee();
		employee.setAge(testInvaldAge);
		int actual = employee.getAge();
		assertEquals(expected, actual);
	}
}
