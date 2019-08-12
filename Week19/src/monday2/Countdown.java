package monday2;

public class Countdown implements Runnable {
	
	
	@Override
	public void run() {
		for(int loop = 10; loop>0;loop--) {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(loop);
		}
	}

}
