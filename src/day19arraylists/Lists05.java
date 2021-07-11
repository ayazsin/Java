package day19arraylists;


import java.util.ArrayList;

import java.util.List;

public class Lists05 {
	
	//From an integer list find the closest two elements

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(2);
		list1.add(43);
		list1.add(31);
		list1.add(12);
		list1.add(78);
		list1.add(16);
		list1.add(67);
		
		List<Integer> differences = new ArrayList<>();
		
		List<String> indexes = new ArrayList<>();
		
		for(int i=0; i<list1.size(); i++) {
			for(int j=i+1; j<list1.size(); j++) {
				differences.add(Math.abs(list1.get(i) - list1.get(j)));
				indexes.add(i + "" + j);
				
			}
		}
		
		int min = Integer.MAX_VALUE;
		for(int i=0; i<differences.size(); i++) {
			if(min>differences.get(i)) {
				min=differences.get(i);
			}
		}
		
		int idxMin = differences.indexOf(min);
		String str = indexes.get(idxMin);
		
		System.out.println("First number " + list1.get(Integer.valueOf(str.substring(0,1))));
		System.out.println("Second number " + list1.get(Integer.valueOf(str.substring(1,2))));
	
	}

}
