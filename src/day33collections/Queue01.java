package day33collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {
	
	/*
	   1)Queue focuses on "First Element", because Queue is used in "First In First Out Operations"
	   2)Because of that, when you use QUEUE as data type you will have mant methods related with first element
	   3)If you use LinkedList constructor to create Queue, the elements will be in order according to the Java 
	     ordering rule but if you want, you can declare a rule to sort the elements. We will learn how to declare 
	     sorting rules in Lambda Course
	 */
	
	public static void main(String[] args) {
		
//		Queue <String> q1 = new LinkedList<>();
//		
//		q1.add("Rick");
//		q1.add("Maggie");
//		q1.add("Glenn");
//		q1.add("Megan");
//		q1.add("Daryl");
//		
//		System.out.println(q1.element());//Retrieves, but does not remove, the head of this queue.
//					                     //@throws NoSuchElementException if this queue is empty
//		
//		System.out.println(q1.peek());//Retrieves, but does not remove, the head of this queue.
//									  //Returns null if this queue is empty
//		
//		System.out.println(q1.poll());//Retrieves and remove the head of this queue.
//									  //Returns null if this queue is empty
//		
//		System.out.println(q1.remove());//Retrieves and remove the head of this queue.
//										//@throws NoSuchElementException if this queue is empty
//		
//		System.out.println(q1.offer("XXXX"));
//		
//		System.out.println(q1.add("YYYY"));
//		System.out.println(q1);
		
		Queue <String> q2 =  new PriorityQueue<>();
		
		q2.add("M");
		q2.add("United States");
		q2.add("AB");
		q2.add("Germany");
		q2.add("X");
		q2.add("12345");
		System.out.println(q2);
		
		int sum = 0;
		System.out.println(sum+=sumDigits(1521));
		
	}
	
	static int sumDigits(int i)
	{
	   return i == 0 ? 0 : i % 10 + sumDigits(i / 10);
	}

}
