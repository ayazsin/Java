package day34maps;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {
	
	/*
	 	1)TreeMap puts the elements in natural order by using keys
	 	2)TreeMap is not thread-safe and is not synchronized
	 	3)TreeMap does not accept null as key
	 	4)TreeMap accepts multible "null"s in values
	 	5)TreeMap is the slowest
	 */

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tm1 = new TreeMap<>();
		tm1.put(105, "Ali");
		tm1.put(101, "Veli");
		tm1.put(103, "Kaan");
		tm1.put(102, "Eric");
		tm1.put(104, "John");
		//tm1.put(null, "XXXX");//NullPointerException
		tm1.put(107, null);
		tm1.put(106, null);
		
		System.out.println(tm1);
		
		//Add elements by using HashMap then convert it to TreeMap
		
		HashMap<Integer, String> hm1 = new HashMap<>();
		
		hm1.put(103, "Ali Can");
		hm1.put(101, "Veli Han");
		hm1.put(102, "Mark Stone");
		hm1.put(100, "Angie Ocean");
		hm1.put(108, "Ali Can");
		hm1.put(107, "Veli Han");
		hm1.put(106, "Mark Stone");
		hm1.put(105, "Angie Ocean");
		System.out.println(hm1);
		
		TreeMap<Integer, String> tm2 = new TreeMap<>(hm1);
		System.out.println(tm2);
		System.out.println(tm2.ceilingEntry(105));//105=Angie Ocean
		System.out.println(tm2.ceilingEntry(90));//100=Angie Ocean
		System.out.println(tm2.ceilingEntry(200));//null
		
		System.out.println(tm2.ceilingKey(105));//105
		System.out.println(tm2.ceilingKey(90));//100
		System.out.println(tm2.ceilingKey(200));//null

	}

}
