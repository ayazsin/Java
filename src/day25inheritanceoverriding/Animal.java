package day25inheritanceoverriding;

public class Animal {
	
	public int height;
	public int weight;
	
	public Animal() {
		this(5);
		System.out.println("Animal constructor without parameter...");
	}
	
	public Animal(int a) {
		System.out.println("Animal constructor with int parameter...");
	}
	
	public Animal(int height, int weight) {
		this.height = height;
		this.weight = weight;
		
	}

}
