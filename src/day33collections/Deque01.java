package day33collections;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {
	
	/*
	   1)Deque stands for Double Ended Queue
	 	2)We can use FIFO and LIFO together in Deque	
	 */

	public static void main(String[] args) {
		
		Deque<String> dq1 = new LinkedList<>();
		
		dq1.addFirst("A");
		dq1.addLast("Z");
		System.out.println(dq1.getFirst());
		System.out.println(dq1.getLast());
		
		dq1.offerFirst("B");
		dq1.offerLast("Y");
		System.out.println(dq1);
		
//		dq1.add(null);
		
		dq1.peekFirst();
		dq1.peekLast();
		
		dq1.pollFirst();
		dq1.pollLast();
		
		System.out.println(dq1);
		
		dq1.removeFirst();
		dq1.removeLast();
		
		System.out.println(dq1);
		
		dq1.removeFirstOccurrence("A");
		dq1.removeLastOccurrence("A");
		
		dq1.removeFirstOccurrence("A");
		dq1.removeLastOccurrence("A");
		
		System.out.println(dq1);
		
		//How can you verify if a specific element is repeated or not
		
		Deque<String> dq2 = new LinkedList<>();
		dq2.add("A");
		dq2.add("B");
		dq2.add("A");
		dq2.add("C");
		dq2.add("A");
		
		dq2.removeFirstOccurrence("A"); 
		if(dq2.removeLastOccurrence("A")) {
			System.out.println("A is repeated");
		} else {
			System.out.println("A is not repeated");
		}
		

	}

}
