package day21foreachloop;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(11);
		list1.add(13);
		list1.add(15);
		list1.add(12);
		list1.add(14);
		System.out.println(list1);
		
		//Use "for loop" to print all elements on the console in the same line 
		//with a space between the elements
		for (int i=0; i<list1.size(); i++) {
			System.out.println(list1.get(i) + " ");
		}
		
		//Use "for each loop" to print all elements on the console in the same line
		//with a space between the elements
		for(Integer w : list1) {
			System.out.print(w + " ");
		}
		System.out.println();
		//Use "for-each loop" to print even elements in the list
		//1. Way
		for(Integer w : list1) {
			if(w%2==0) {
			System.out.print(w + " ");
			}
		}
		System.out.println();
		//2.Way
		for(int w : list1) {
			if(w%2!=0) {
			 continue;
			}
			System.out.print(w + " "); //Skips the element
		}
		
		
		System.out.println();
		//Wrapping class / Autoboxing / unboxing
		int a=12;
		Integer b =12;
		int c=b;
		System.out.println(a + "-" + b + "-" + c);
		
		//Use "for-each loop" to print last 3 elements in the list
		//1.Way
		for(int w:list1) {
			if(list1.indexOf(w)>=list1.size()-3) {
				System.out.print(w + " ");
			}
		}
		System.out.println();
		//2.Way
		for (int w: list1) {
			if(list1.indexOf(w)<list1.size()-3) {
				continue;
			}	
			System.out.print(w + " ");
		}
		
		System.out.println();
		//3.Way
		for (int w: list1.subList(list1.size()-3, list1.size())) {	
			System.out.print(w + " ");
		}
		
		System.out.println();
		//Use "for-each loop" to print first 3 elements in the list
		//1.Way
		for(int w:list1) {
			if(list1.indexOf(w)<=list1.size()-3) {
				System.out.print(w + " ");
			}
		}
		System.out.println();
		//2.Way
		for (int w: list1.subList(0, 3)) {
			System.out.print(w +" ");
		}	
		
		System.out.println();
		//3.Way
		for (int w: list1) {
			if(list1.indexOf(w)>2) {
				break;
			}
			System.out.print(w +" ");
		}	
			
		}
	}


