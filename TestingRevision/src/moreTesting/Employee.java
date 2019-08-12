package moreTesting;

public class Employee {
	
	private String name;
	private int age;
	
	
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
	 */
	public void setAge(int age) throws Exception{
		if(age >= 18 && age <= 30) {
			this.age = age;
		} else {
			throw new Exception();
		}
	
	}

}
