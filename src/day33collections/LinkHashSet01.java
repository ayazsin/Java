package day33collections;

import java.util.LinkedHashSet;

public class LinkHashSet01 {
	
	/*
 	1)LinkedHashSet puts the elements in insertion order
 	2)LinkedHashSet spends time on ordering elements, because of that it is slower than HashSet
    */
	

	public static void main(String[] args) {
		
		
		LinkedHashSet<String> lsh1 = new  LinkedHashSet<>();
		
		lsh1.add("A");
		lsh1.add("YZ");
		lsh1.add("N");
		lsh1.add("P");
		lsh1.add("P");
		lsh1.add("C");
		lsh1.add("ABC");
		
		
		
		System.out.println(lsh1);
		
	}

}
