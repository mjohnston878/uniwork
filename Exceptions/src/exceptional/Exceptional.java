package exceptional;

public class Exceptional {
	
	public int doubleUp(int num) {
		if(num<1) {
			throw new IllegalArgumentException();
		} else {
			return num*2;
		}
	}

}
