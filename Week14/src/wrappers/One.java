/**
 * 
 */
package wrappers;

/**
 * @author matthew
 *
 */
public class One {

	/**
	 * 
	 */
	public One() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int myNum = 33;
		Integer myInt = new Integer(56);
		
		
		System.out.println(myNum);
		System.out.println(myInt);
		
		Integer myInt2 = new Integer("45");
		System.out.println(myInt2);
		
		//Integer prob new Integer("Ten");
		
		Integer myI = new Integer(34);
		int weeInt = myI.intValue();
		System.out.println("int value: "+weeInt);
		
		
		
		System.out.println("Biggest: " +Integer.max(weeInt, myI));
		
		double weeD = myI.doubleValue();
		System.out.println(weeD);
		
		int myint = Integer.parseInt("10");
		System.out.println(myInt);
		
		Double myD = myI.doubleValue() + 3.4;
		System.out.println(myD);
		
		
		
	}

}
