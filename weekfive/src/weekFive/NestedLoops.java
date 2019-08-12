package weekFive;

public class NestedLoops {

	public NestedLoops() {
	
	//nest for loops
	//outer loop
		
		for (int outer = 1; outer <=3; outer++) { // start of outer
			//inner loop
			for (int inner = 1;inner < 5; inner++) { // start of inner
				System.out.println(outer +" " +inner);

			} // end of inner
		} // end of outer
		
		System.out.println("Bye");
		
	}

}
