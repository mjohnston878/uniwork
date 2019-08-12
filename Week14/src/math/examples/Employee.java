package math.examples;

public class Employee {
	// instance vars
	private String name;
	private int age;

	public Employee(String name, int age) throws Exception {
		this.name = name;
		this.setAge(age);
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 * @throws Exception 
	 */
	public void setAge(int age) throws Exception {
		if (age >= 18 && age <= 30) {
			this.age = age;
		} else {
			throw new Exception();
		}
	}

}
