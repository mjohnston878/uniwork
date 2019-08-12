package clements;

public class NamedThread implements Runnable {

	public int number = 0;
	
	@Override
	public void run() {

		System.out.println("Thread started..."+number);
	}
	
	

}
