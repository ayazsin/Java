package adeneme;

import java.util.ArrayList;
import java.util.List;

public class Spiral {

	public static void main(String[] args) {
		int arr [][] = { { 1,   2,   3,   4,   5 }
				        ,{ 16,  17,  18,  19,  6 }
						,{ 15,  24,  25,  20,  7 }
						,{ 14,  23,  22,  21,  8 }
						,{ 13,  12,  11,  10,  9 }};
		
		System.out.println(orderInSpiral(arr));
		
		

	}
	
	static List <Integer> orderInSpiral(int arr[][]) {
		List <Integer> list=new ArrayList<>();
		for (int w:arr[0]) list.add(w);
		for (int i=1; i<5; i++) list.add(arr[i][4]);
		for (int i=4; i>-1; i--) list.add(arr[4][i]);
		for (int i=3; i>0; i--) list.add(arr[i][0]);
		for (int i=1; i<4; i++) list.add(arr[1][i]);
		for (int i=2; i<4; i++) list.add(arr[i][3]);
		for (int i=2; i>0; i--) list.add(arr[3][i]);
		for (int i=1; i<3; i++) list.add(arr[2][i]);
	
		return list;
	}

}
