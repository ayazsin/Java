package day34maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap02 {
	
	public static void main(String[] args) {
		
		//How to iterate in HashMap
		
		HashMap<Integer, String> hm1 = new HashMap<>();
		
		hm1.put(100, "Ali Can");
		hm1.put(101, "Veli Han");
		hm1.put(102, "Mark Stone");
		hm1.put(103, "Angie Ocean");
		
		//1.Way:Use for-each loop and Map.entrySet()
		//To convert a Map to a collection, you need to use entrySet()
		for (Map.Entry<Integer, String> w: hm1.entrySet()) {
			System.out.print(w.getKey()+ " ");
			
			System.out.print(w.getValue());
			
			System.out.println();
			
		}
		//2.Way:Iterator on Map.entry(K,V)
		Iterator<Map.Entry<Integer, String>> hm1Itr = hm1.entrySet().iterator();
		
		while(hm1Itr.hasNext()) {
			
			Map.Entry<Integer,String> entry=hm1Itr.next();
			System.out.print(entry.getKey()+"  ");
			System.out.print(entry.getValue());
			System.out.println();
		}
		
	}

}
