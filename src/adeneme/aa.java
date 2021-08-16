package adeneme;

public class aa {

	public static void main(String[] args) {
		System.out.println(computerCheckDigit("39847"));
	}
	
	public static int computerCheckDigit(String number) {
		int n=0;
		for (int i=0; i<number.length(); i+=2) {
		 n=n+Integer.parseInt(number.substring(i,i+1));	
		}

		n=n*3;
		n=sumDigits(n);
		n=n/10;
		n=10-n;
		
		
		
		return n;
	}
	
	public static int sumDigits(int i) {
	    return i == 0 ? 0 : i % 10 + sumDigits(i / 10);
	}
}
