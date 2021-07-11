package adeneme;

import java.util.Scanner;

public class ForLoopChar {
	


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char ch=scan.nextLine().toUpperCase().charAt(0);
		
		for (char i='A'; i<=ch; i++) {
			for (int k=i+1; k<=ch; k++) {
				System.out.print(" ");
			}
			for (char j=i; j>='A'; j--) {
				System.out.print(j);
			}
			for (char m='B'; m<=i; m++) {
				System.out.print(m);
			}
			
			System.out.println();
		}
		for (char i=(char) (ch-1); i>='A'; i--) {
			for (int k=(char) (ch-1); k>=i; k--) {
				System.out.print(" ");
			}
			for (char j=i; j>='A'; j--) {
				System.out.print(j);
			}
			for (char m='B'; m<=i; m++) {
				System.out.print(m);
			}
			
			System.out.println();
		}
			
		scan.close();

	}
	
	

}
