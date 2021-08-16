package day30exceptionsinterfacesiteratorscollections;

public interface AirCondition {
	int price = 3000;
	void climate();
	void eat();
	
	/*
	 	Interview Question: What is the difference between "Abstract Class" and "Interface"?
	 						1)Abstract Class can have concrete methods withoud needing any keyword
	 						  Interface can have concrete methods with "default" and "static" keywords
	 						2)In an interface all methods are public and abstract, but in an abstract class
	 						 you can have every type of methods
	 						3)All variables are "public", "static", and "final" in interfaces, in abstarct classes
	 						  we can have every type of variables
	 						4)Abstract classes have constructors, interfaces do not have.
	 						5)Both cannot be instantiated (creating object)
	 						6)A concrete class can have just a single "abstract class" parent but it can have
	 						  multible interface parent   
	 						7)Class ====>Interface use "implements" keyword
	 						  Interface ====> Interface use "extends" keyword  
	 						  Class ====> Class use "extends" keyword 
	 */
	

}
