package day10loops;

public class ForLoop01 {

	public static void main(String[] args) {
		// Print "Hello world!" on the console 10 times...
		
		//1.Way:
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");
		
		System.out.println("=============");
		
		//2.Way: Use for-loop
		//for(Starting ; Condition; Increment/Decrement) { } 
		
		for( int i=1; i<=10 ; i++ ) {
		
		System.out.println("Hello World");	
				
		}
		
		//Print integers from 13 to 15 on the console in the same line with a space between them
		
		for( int i=13; i<=15 ; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		//Print integers from 16 to 14 on the console in the same line with a space between them

		for( int i=16; i>=14 ; i--) {
			System.out.print(i + " ");
		}
		
		//Print the even integers from 15 to 50 on the console
		
		//1. way:
		System.out.println();
		for( int i=16; i<=50 ; i+=2) {
			System.out.print(i + " ");
		}
		//2. way:
		System.out.println();
		for( int i=15; i<=19 ; i++) {
			if (i%2==0) {
				System.out.print(i + " ");	
			}
		}
		//Print the odd integers from 120 to 65 on the console
			
		//1. way:
		
		System.out.println();
		for (int i = 120; i>=65 ; i--) {
			
			if (i%2==1) {
				System.out.print(i + " ");			
			}	
		}
		
		//2.Way:
		System.out.println();
		for (int i = 119 ; i>64 ; i-=2) {
			System.out.print(i + " ");
		}
		
		
		
		//Print the integers divisible by 4 and 6 from 13 to 130
		
		//1.way:
		System.out.println();
		for (int i = 13; i<=130 ; i++) {
			
			if (i%4==0 && i%6==0 ) {
				System.out.print(i + " ");			
			}	
		}
		
		//2.way:
		System.out.println();
		for (int i = 24; i<=130 ; i+=12 ) {
			System.out.print(i + " ");	
		}
		
		
		//Print the every character of a String by putting space between every consecutive character
		//Example: Suleyman ==> S u l e y m a n
		
		System.out.println();
		String name = "Suleyman";
		for (int i = 0; i < name.length(); i++) {
		System.out.print(name.charAt(i) + " ");	
		
		
		}	
		System.out.println();
		System.out.println(name.replace("", " ").trim());
		
	}

}
