package practice09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AscendingOrderArray {

	public static void main(String[] args) {
//		11. Write a method that accepts an Array of ints returns 
//		the sorted Array in ascending order.Do not use the sort method.
		int list[] = {3,6,9,11,5};
		System.out.println(Arrays.toString(ascendingOrder(list)));
	
		List<Integer> list1 = new ArrayList<>();
		list1.add(2);
		list1.add(43);
		list1.add(31);
		list1.add(12);
		list1.add(78);
		list1.add(16);
		list1.add(67);
		
		System.out.println(ascending(list1));
		
	}
	
	static int[] ascendingOrder(int list[]) {
		int min=0;
		
		for (int i=0; i<list.length; i++) {
			for ( int j=i+1; j<list.length; j++) {
				if (list[j]<list[i]) {
					min = list[j];
					list[j]=list[i];
					list[i]=min;
				}
			} 
		}
		return list;
	}
	
	static List<Integer> ascending(List<Integer> list1) {
		int min=Integer.MAX_VALUE;
		List <Integer> list2 = new ArrayList<>(); 
		for (int i=0; i<list1.size(); i++) {
			for (int j=0; j<list1.size(); j++) {
				if(list2.contains(list1.get(j))) {
					continue;
				}
				if(min > list1.get(j)) {
					min=list1.get(j);		
				}
			}
			list2.add(i,min);
			min=Integer.MAX_VALUE;
	}
		return list2;
	}
	
}
	
	
	
	
