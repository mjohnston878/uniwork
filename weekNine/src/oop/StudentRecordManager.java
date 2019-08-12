/**
 * 
 */
package oop;

/**
 * @author matthew
 *
 */
public class StudentRecordManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Create Student 1
		Student student1 = new Student();
		student1.setName("Matt");
		System.out.println(student1.getName());
	
		
		
		// Create Student 2
		Student student2 = new Student();
		student2.setName("Tim");
		System.out.println(student2.getName());
	}

}
