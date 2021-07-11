package day02typecasting_wrapperclasses_scanner;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		//Create Scanner Object
		Scanner scanner = new Scanner(System.in);
		
		//Give message to user
		System.out.println("Hey user, enter your firstname...");
		
		//Create a container to store data coming from user
		String firstName = scanner.nextLine();
		
		System.out.println("Hey user, enter your lastName");
		String lastName = scanner.nextLine();
		
		System.out.println("Hey user, enter your address");
		String address = scanner.nextLine();
		
		System.out.println("You are retired, true or false?");
		boolean isRetired = scanner.nextBoolean();
		
		//Note:	To get String data from user you have nextLine() and next() methods.
		//nextLine() takes all String, but next() takes just the first word.
		System.out.println("Hey user, enter your name...");
		String name = scanner.nextLine();
		
		//Print the name on the console
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(address);
		System.out.println(isRetired);
		System.out.println(name);
			
		scanner.close();
	}

}
