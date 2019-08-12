package recursion;

public class CallStack {

	public CallStack() {
		// TODO Auto-generated constructor stub
	}

	public static void method3() {
		System.out.println("in 3");
	}
	
	public static void method2() {
		System.out.println("in 2");
		method3();
	}
	
	public static void method1() {
		System.out.println("In 1");
		method2();
	}
	
	public static void main(String[] args) {
		method1();
		
	}

}
