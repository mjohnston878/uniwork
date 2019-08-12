package recursion;

public class CallMe {

	public CallMe() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int i = 1;
		callMe(i);
		
	}

	public static void callMe(int i) {
		System.out.println("Call me" +i);
		i++;
		callMe(i); // recursive call
	}
}
