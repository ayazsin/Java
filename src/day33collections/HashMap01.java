package day33collections;

import java.util.HashMap;

public class HashMap01 {
	
	/*
	 	1)HashMap does not put the elements in any order.
	 	  Because of that it is fast
	 	2)Keys must be unique in Maps, if you try to put repeated key, Java will overwrite 
	 	3)Values can be repeated in Maps
	 	4)We can use null in Keys
	 	  We can use null in Values repeatedly
	 	5)HashMaps are not thread-safe and not synchronized
	 */

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm1 = new HashMap<>();
		
		hm1.put(100, "Ali Can");
		hm1.put(101, "Veli Han");
		hm1.put(102, "Mark Stone");
		hm1.put(103, "Angie Ocean");
		hm1.put(103, "Kemal Kuzu");
		hm1.put(null, "Angie Ocean");
		hm1.put(null, "Kemal Kuzu");
		hm1.put(104, null);
		hm1.put(105, null);
		
		//Returns the value to which the specified key is mapped
		System.out.println(hm1.get(100));//Kemal Kuzu
		//For non-existing keys return null
		System.out.println(hm1.get(108));//null
		System.out.println(hm1.containsKey(100));
		
		System.out.println(hm1.getOrDefault(102, "No value for that key"));
		
		//Returns the keys in a set Collection
		System.out.println(hm1.keySet());//[null, 100, 101, 102, 103, 104, 105]
		
		System.out.println(hm1.values());//[Kemal Kuzu, Ali Can, Veli Han, Mark Stone, Kemal Kuzu, null, null]
		
		System.out.println(hm1.containsKey(108));//false
		System.out.println(hm1.containsKey(103));//true
		System.out.println(hm1.containsValue("Veli Han"));//true
		System.out.println(hm1.containsValue("Veli"));//false
		

		
		HashMap<Integer, String> hm2 = new HashMap<>();
		
		hm2.put(108, "Ali");
		hm2.put(109, "Veli");
		hm2.put(110, "Mark");
		
		//Copies all of the mappings from the specified map to this map.
		hm1.putAll(hm2);
		
		//If key exists, don't change existing value, otherwise create new key-value
		hm1.putIfAbsent(111, "Suleyman");
		hm1.putIfAbsent(null, "ZZZZZ");
		hm1.putIfAbsent(106, "KKKKKK");
		
		//replace() is used to update value by using key
		//If you use replace() with a non-existing key, it will do nothing
		System.out.println(hm1.replace(106, "LLLLL"));//KKKKKK
		hm1.replace(112, "LLL");
		
		//Following replace() does check for key and value, if both match then it does update
		System.out.println(hm1.replace(106, "LLLLL", "!!!!!"));//true
		
		System.out.println(hm1.size());//12
		
		
		
		System.out.println(hm1);
		
		

	}

}
