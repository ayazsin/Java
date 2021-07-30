package day25inheritanceoverriding;

public class Runner {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog(true);
		System.out.println(dog1.height);//3
		System.out.println(dog1.weight);//4
		System.out.println(dog1.haveBaby);//true
		System.out.println(dog1.smellWell);//true
		
		Audi audi1 = new Audi();
		audi1.move();
		

	}

}
