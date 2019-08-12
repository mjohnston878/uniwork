package monday2;

public class CountdownController {

	public static void main(String[] args) {

		Countdown countDown = new Countdown();
		
		Thread t = new Thread(countDown);
		
		t.start();
	}

}
