package monday;

public class MyThread extends Thread {

	
	/**
	 * method id a threaded...
	 */
	@Override
	public void run() {
		
		do {
		
		System.out.println("My first thread");
		
		} while (true);
	}
	
}
