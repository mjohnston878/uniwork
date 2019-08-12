package catchStuff;

public class ThreadImplExample implements Runnable {

	@Override
	public void run() {

		for(int loop = 0;loop<1000000; loop++) {
			
			if(Thread.interrupted()) {
				System.out.println("Someone knocked.. let's quit");
				break;
			}
			
		}
	}

}
