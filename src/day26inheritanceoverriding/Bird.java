package day26inheritanceoverriding;

	/*
	 	super()
	 	1)super() is used to call a specific constructor from parent class.
	 	2)Typing "super()" or not typing "super()" have same meaning.
	 	3)super() must be used in the first line inside the constructor
	 	4)super() can be used just once inside a constructor
	 	5)super() can call constructors just from "parent class" 
	 	  not from "grand parent class"
	 	
	 */

		/* 
			If you use this. then you will be able to see all variables whose names are diffrenet from the class
			 it self and from all parent classes
			If you want to see variables whose names are same from parent classes do not use this. because 
			you cannot see same named variables by using this.	
		*/

public class Bird extends Mammal{ 
	
	String name = "Bird";
	int height = 11;
	byte ageOfBird = 1;
	
	public Bird() {
		super(3);
		System.out.println(super.ageOfAnimal);
		System.out.println(super.ageOfMammal);
		System.out.println(super.height);
		System.out.println(super.name);
		System.out.println(this.height);
		
		super.move();//Mammals move
		
		System.out.println("Child constructor ran...");
	}
	
	public void move() {
		System.out.println("Birds move..");
	}
	
	public void fly() {
		System.out.println("Birds fly..");
	}

}
