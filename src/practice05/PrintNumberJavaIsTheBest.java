package practice05;

public class PrintNumberJavaIsTheBest {

	public static void main(String[] args) {
		 /*
         * write a method which prints out the numbers from 1 to 33
         * but for numbers which are a multiple of 3, print Java instead of number
         * and  for numbers which are a multiple of 5, print Best instead of the number.
         *
         * For numbers which are a multiple by of both 3 and 5, print JavaIsTheBest instead
         * of the number
         */
		
		java();

	}
	
	public static void java() {
		for (int i =1 ; i<34; i++) {
			
			if(i%5==0 && i%3==0) {
				System.out.println("JavaIsTheBest ");
			} else if (i%3==0) {
				System.out.println("Java ");
			} else if(i%5==0) {
				System.out.println("Best ");	
			} else {
				System.out.println(i + " ");
			}
		}
	}

}
