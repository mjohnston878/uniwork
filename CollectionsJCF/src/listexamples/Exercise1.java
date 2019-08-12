/**
 * 
 */
package listexamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;


/**
 * @author matthew
 *
 */
public class Exercise1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("Belfast");
		arrList.add("Dublin");
		
		
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("London");
		linkedList.add("Cardiff");
		
		
		//showAll(arrList);
		
		showall(linkedList);
	}
	
	/*
	public static void showAll(ArrayList<String> arrayList) {
		for (String city : arrayList) {
			System.out.println(city);
		}
	}
	*/
	
	public static void showall(List<String> cities) {
		for (String city : cities) {
			System.out.println(city);
		}
		
	}
	
	public static void showAll(Collection<String> list) {
		for (String s : list) {
			System.out.println(s);
		}
	}
}
