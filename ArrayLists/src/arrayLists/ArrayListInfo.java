/**
 * 
 */
package arrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
/**
 * @author matthew
 *
 */
public class ArrayListInfo {

	/**
	 * 
	 */
	public ArrayListInfo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// array lists dont like primitive types.  Can only use objects!
		ArrayList<String> list = new ArrayList<String> ();
		
		list.add("Apples");
		list.add("Oranges");
		
		System.out.println(list.toString());
		
		list.add(0, "Pears");
		
		System.out.println(list.toString());
		
		System.out.println("Size: " +list.size());
		
		
		// looping through with standard for loop
		for(int loop = 0; loop < list.size(); loop++) {
			System.out.println(list.get(loop));
		}
		
		// looping through with enhanced for loop
		for(String s : list) {
			System.out.println(s);
		}
		
		System.out.println("\nIterator");
		// iterator 
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\nSearch for: ");
		// search for
		if(list.contains("Pears")) {
			System.out.println("Got Pears!");
		}
		
		System.out.println("\nSorting");
		// sorting using collections
		Collections.sort(list);
		System.out.println(list.toString());
		
		System.out.println("\nCalling ArrayList with method: ");
		showMeList(list);
		
	}

	public static void showMeList(ArrayList<String> theList) {
		System.out.println(theList.toString());
	}
	
}
