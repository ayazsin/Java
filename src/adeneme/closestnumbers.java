package adeneme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class closestnumbers {

	public static void main(String[] args) {
		
		//Find the closest two numbers in the list
		
		List <Integer> list = new ArrayList <Integer>();
		list.add(3);
		list.add(6);
		list.add(8);
		list.add(87);
		list.add(45);
		list.add(4);
		
		Collections.sort(list);
		int min = Integer.MAX_VALUE;
		int dif = 0;
		int idx1 = 0;
		int idx2 = 0;
		
		for (int i=0; i<list.size()-1; i++) {
			for (int j=i+1; j<list.size(); j++) {
				dif = Math.abs(list.get(i)-list.get(j));
				if (dif<min) {
					min = dif;
					idx1 = i;
					idx2 = j;
				}
			}
		}
		System.out.println("The Closest numbers are " + list.get(idx1) + "-" + list.get(idx2));
		

	}

}
