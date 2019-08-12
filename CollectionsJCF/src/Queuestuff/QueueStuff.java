package Queuestuff;

import java.util.*;

public class QueueStuff {
	
	public static void main(String[] args) {
		
		Queue<String> myFamily = new PriorityQueue<>();
		
		myFamily.add("Aidan");
		myFamily.add("Claire");
		myFamily.add("Una");
		myFamily.add("Niamh");

		System.out.println(myFamily.toString());
		
		// poll, peek, remove, enqueue, dequeue
		
		while (!myFamily.isEmpty()) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(myFamily.remove());
		}
		
		System.out.println(myFamily.size());
	}

}
