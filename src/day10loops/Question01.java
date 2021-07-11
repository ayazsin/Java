package day10loops;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		/*
		 Ask use to enter firstname and lastname under given conditions;
            
            1)If user uses space characters at the beginning or at the end remove them.
            2)If user enters nothing or just space character, give a message like
              "Just space characters or nothing is not valid"
            3)If user does not use space character between first and last name 
              give a message like "One of the lastname and first name is not entered 
              or space is not used between firstname and lastname"
            4)If user uses multiple space characters between firstname and lastname 
              make it single  
            5)Initials of firstname and lastname should be uppercase, 
              other characters should be lowercases.
              If user does not enter the name in this format fix it.
		 */
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter your first name and last name...");
		String name = input.nextLine();
		
		
		/*
		 Note : Just by using String methods, you cannot change the original String.
		 		Because of that Strings are called "Immutable"
		 		If you want to change the original String, you have to do assignment like below
		 */
		
		//1. Step:
		name = name.trim();
		
		
		//2. Step:
		if (name.isBlank() == true) {
			
			System.out.println("Just space characters or nothing is not valid");
		}
		
		//3. Step:
		if(!name.contains(" ")) {
			System.out.println("One of the lastname and first name is not entered \n"
					+ "              or space is not used between firstname and lastname");
		}
		//4. Step:
		if(name.indexOf(" ")!=name.lastIndexOf(" ")) {
			
			
			name = name.substring(0, name.indexOf(" ")) + " " + 
						name.substring(name.lastIndexOf(" ")+1);	
		}
		
		//5. Step:
		
		/*
		 
		  When you create a variable between any curly braces, the variable can be used just inside the curly brace.
		  If you try to use the variable outside the curly brace, Java will give Compile Error
		  
		 */
		int idxOfSpace = name.indexOf(" ");
		name = name.substring(0,1).toUpperCase() + name.substring(1, idxOfSpace).toLowerCase()+
				" " + name.substring(idxOfSpace +1, idxOfSpace + 2 ).toUpperCase() + 
						name.substring(idxOfSpace + 2).toLowerCase();
			
		
		System.out.println(name);
		
		input.close();
		
		}
	}


