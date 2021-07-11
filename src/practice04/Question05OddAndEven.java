package practice04;

public class Question05OddAndEven {

	public static void main(String[] args) {
		/*1111111
		  1111122
          1111333
          1114444
          1155555
          1666666
          7777777
        Write a java program for this pattern.
		 */
		
		for (int i=1; i<=7 ; i++) {
			for (int k=7; k>=i ; k--) {
				System.out.print("1");
			}
			for (int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
