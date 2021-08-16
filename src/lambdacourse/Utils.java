package lambdacourse;



public class Utils {
	
	public static void printInTheSameLineWithASpace(Object o) {
		System.out.print(o + " ");
		
	}
	public static boolean isEven(int x) {
		return x%2==0;
	}
	
	public static boolean isOdd(int x) {
		return x%2==1;
	}
	public static int getSquare(int x) {
		return x*x;
	}
	
	public static int getCube(int x) {
		return x*x*x;
	}
	
	public static int getHalf(int x) {
		return x/2;
	}

}
