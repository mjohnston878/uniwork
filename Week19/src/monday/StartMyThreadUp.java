package monday;

public class StartMyThreadUp {

	public static void main(String[] args) {

		System.out.println("Starting main");
		MyThread myThread = new MyThread();
		myThread.start();
		System.out.println("Ending main");
		
	}

}
