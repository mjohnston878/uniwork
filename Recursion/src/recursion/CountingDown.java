package recursion;

public class CountingDown {

	public CountingDown() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		countDown(3);
	}
	
	public static void countDown(int num) {
		// base case (end)
		if (num <= 0) {
			System.out.println("End");
		} else {
			

			System.out.println(num);
			countDown(--num);

		}
	}

}
