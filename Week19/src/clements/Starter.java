package clements;

public class Starter {

	public static void main(String[] args) {

		for(int loop = 0; loop<1000; loop++) {
		
		NamedThread namedThread = new NamedThread();
		namedThread.number = loop;
		Thread t = new Thread(namedThread);
		t.start();
		
		}
	}

}
