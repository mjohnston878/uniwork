package myfirstproject;

public class maths {

	public static void main(String[] args) {
		
		int a = 48;
		System.out.println(6 * 2 / methodCall(2, 8, 4) + a++);

		int b =20;
		System.out.println(b++  / methodCall(2, 25, 5) + 8 / methodCall(2,8,2));

	}
	
	public static int methodCall(int a, int b, int c) {
	    return a + b / c;
	}
}
