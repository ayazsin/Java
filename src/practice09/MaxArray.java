package practice09;

public class MaxArray {

	public static void main(String[] args) {
		//9. Write a method that accepts an Array of integers and returns the max.
		int list[] = {2,5,6,7,8,30};
		System.out.println(maxInArray(list));

	}
	
	static int maxInArray(int list[]) {
		int max=0;
		for (int w: list) {
			if (w>max) {
				max=w;
			}
		}
		return max;
	}

}
