package day25inheritanceoverriding;

public class Dog extends Mammal {
	
	public boolean smellWell;
	public int height;
	
	
	public Dog() {
		super();//If you type "super()" is is fine,
				//If you do not type Java puts it automatically
		System.out.println("Dog constructor without parameter...");
	}
	
	public Dog(boolean smellWell) {
//		public int height = 25;
//		super(true);
		//If you don't type any parent constructor call inside the fisrt line
		//Java uses the parent constructor without parameter automatically
		/*
		  "super()" is for "parent constructors call"
		  "super" is for "parent variables call"
		 */
//		super.haveBaby = true;
//		super.height=11;
//		super.weight=22; 
//		super.height=20; //==>returns the height value from parent classes (Animal)
//		this.height = 25; //==>returns the height value from the class itself (Dog)
//		If you have multible variables whose names are same in fifferent parent classes
//		super keyword selcts the closest one
		
		this.smellWell = smellWell;
		
	}

	

}
