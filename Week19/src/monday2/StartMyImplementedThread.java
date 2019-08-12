package monday2;

public class StartMyImplementedThread {

	public static void main(String[] args) {

		System.out.println("Start of main");
		
		MyThread2 myThread2 = new MyThread2();
		
		Thread thread = new Thread(myThread2);
		
		thread.start();
		
		System.out.println("End of main");
	}

}
