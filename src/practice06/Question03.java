package practice06;

public class Question03 {

	public static void main(String[] args) {
		/* create 3 char variables then print A L I on the console using
         String pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		*/
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char a = abc.charAt(0);
		char b = abc.charAt(11);
		char c = abc.charAt(8);
		
		System.out.println(""+a+ " " + b+ " " + c);
		
	}

}
