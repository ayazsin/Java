package adeneme;
import java.util.Scanner;
public class PerfectNumber {

	
	
	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter a number...");
	    int n=scan.nextInt();
			int i=1;
			int sum = 0;
			while (i<6) {
				if(n%i==0) {
					sum= sum + i;
				}
				i++;
			}
			if (sum==n) {
				System.out.println(n+ " is Perfect Number");
			}else {
				System.out.println(n+ " is not Perfect Number");
			}
scan.close();
	  }
	

	}


