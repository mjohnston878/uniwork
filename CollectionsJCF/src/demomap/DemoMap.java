package demomap;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {

	public static void main(String[] args) {

		Map<Integer, String> numbers = new HashMap<>();
		numbers.put(1, "One");
		numbers.put(2, "Two");
		numbers.put(4, "Four");
		
		// get the keys
		System.out.println(numbers.keySet());
		
		
		//get value
		System.out.println(numbers.get(1));
		
		
		//get all values
		for(Integer key : numbers.keySet()) {
			System.out.println(key + " : " + numbers.get(key));
		}
		
		
		
		numbers.put(2, "twooooo");
		
		
		numbers.remove(2);
		
		
		
	}

}
