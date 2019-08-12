package arrayLists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
import java.util.Collections;

public class PracticeArrayLists1 {

	public PracticeArrayLists1() {
		
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Peaches");
		list.add("Grapefruit");
		list.add("Apples");
		list.add("Pears");
		
		System.out.println(list.toString());
		
		list.add(0,"Oranges");
		
		System.out.println(list.toString());
		
		System.out.println("Size: "+list.size());
		
		// for loop
		System.out.println("\nFor loop:");
		for (int loop = 0; loop < list.size(); loop++) {
			System.out.println(list.get(loop));
		}
		
		// advanced for loop
		System.out.println("\nAdvanced for loop:");
		for (String s: list) {
			System.out.println(s);
		}
		
		// iterator
		System.out.println("\nUsing iterator:");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// searching ArryList
		System.out.println("\nSearching ArrayList");
		if(list.contains("Pears")) {
			System.out.println("There are pears!");
		}
		
		// Sorting ArrayList
		System.out.println("\nSorting an ArrayList");
		Collections.sort(list);
		System.out.println(list.toString());
	}

}
