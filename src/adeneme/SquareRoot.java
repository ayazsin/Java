package adeneme;

import java.util.ArrayList;
import java.util.List;

public class SquareRoot {

	public static void main(String[] args) {
		
		List <Integer> list = new ArrayList<>();
		list.add(6);
		list.add(5);
		list.add(36);
		list.add(25);
		list.add(14);	
		for (Integer w: list) {
			if (Math.sqrt(w)%1==0) {
				System.out.println(w + " is a square root of " + (int)Math.sqrt(w));
			}
		}
}
	
}
