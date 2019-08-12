package collectionsstuff;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsClassSort {

	public static void main(String[] args) {

		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades", "Jokers"};
		
		// create and display a list containing the suits array elements
		List<String> list = Arrays.asList(suits); //create list
		System.out.println(list.toString());
		
		
		
		// or
		System.out.printf("Unsorted array elements %s\n", list);
		
		// sort arraylist
		Collections.sort(list);
		
			// sorted
			System.out.printf("Sorted array elements %s\n", list);
		
		//Reverse Sort
		Collections.sort(list, Collections.reverseOrder());
		
			System.out.println(list.toString());
	}

}
