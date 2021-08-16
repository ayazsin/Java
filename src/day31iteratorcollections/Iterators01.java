package day31iteratorcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {
public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		list1.add("Ali");
		list1.add("Can");
		list1.add("Aliye");
		list1.add("Canan");
		
		for(String w:list1) {
			w=w+"!";
		}
		
		//By using for-loop we are not able to change the collection elements
		System.out.println(list1);//[Ali, Can, Aliye, Canan]
		
		//Use Iterator
		//How to update list by using ListIterator
		ListIterator<String> list1itr = list1.listIterator();//[Ali, Can, Aliye, Canan]
		
		while(list1itr.hasNext()) {
			String element = list1itr.next();
			list1itr.set(element+"!");
		}
		
		System.out.println(list1);//[Ali!, Can!, Aliye!, Canan!]
		
		List<String> list2 = new ArrayList<>();
		list2.add("Apple");
		list2.add("Samsung");
		list2.add("Huavei");
		
		//Update all elements and print them in reverse order
		ListIterator<String> list2itr = list2.listIterator();
		
		while(list2itr.hasNext()) {
			list2itr.next();
		}
		
		//When you use "hasPrevious() and "previous" methods, you will be able to 
		//work with the list element in reverse order
		
		while(list2itr.hasPrevious()) {
			String element = list2itr.previous();
			System.out.println(element + "?");
		}
		
		Collections.reverse(list2);
		System.out.println(list2);
		
		//How to remove all elements by using ListIterator
		
		List<String> list3 = new ArrayList<>();
		list3.add("A");
		list3.add("S");
		list3.add("H");
		
		ListIterator<String> list3itr = list3.listIterator();
		System.out.println("before " + list3);
		
		//If you use remove() method without using next() you will get Illegal StateException
		while(list3itr.hasNext()) {
			list3itr.next();
			list3itr.remove();	
		}
		System.out.println("after " + list3);
		
		//How to add elements into a list by using ListIterator
		List<String> list4 = new ArrayList<>();
		list4.add("X");
		list4.add("Y");
		list4.add("Z");
		
		ListIterator<String> list4itr = list4.listIterator();
		
		//If you use while loop like below, elements will be added to the end, if you do not
		//use while loop elements will be added to beginnig of the list
		while(list3itr.hasNext()) {
			list4itr.next();
		}
		
		list4itr.add("T");
		list4itr.add("U");
		list4itr.add("V");
		
		System.out.println(list4);//[T, U, V, X, Y, Z]
		
		//Difference between Iterator and ListIterator
		List<String> list5 = new ArrayList<>();
		list4.add("AB");
		list4.add("CD");
		list4.add("EF");
		
		Iterator<String> list5Itr = list5.iterator();
		//In Iterartor, there is no hasPrevious() and previous() methods, because of that it is one-directional
		//In Iterartor, there is no add() method, so we cannot add new elements by using Iterator
		//In Iterator, there is no set() method, so we cannot modify the elements by using Iterator
		//In Iterator, and in ListIterator, there is remove()
		//Iterator can be used in other Collections(Map, Set, List), but ListIterator can be used just in lists
		
		while(list5Itr.hasNext()) {
			list5Itr.next();
			
		}
		
		
}
}
