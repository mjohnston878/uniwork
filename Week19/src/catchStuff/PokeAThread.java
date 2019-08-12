package catchStuff;

public class PokeAThread  {

	public static void main(String[] args) {

		ThreadImplExample ti = new ThreadImplExample();
		Thread t = new Thread();
		
		t.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t.interrupt();
		
		
		System.out.println("Main done");
	}

}
