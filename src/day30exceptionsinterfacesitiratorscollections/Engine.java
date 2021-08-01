package day30exceptionsinterfacesitiratorscollections;

public interface Engine {
	
	int price = 8000;
	String name ="Eco";
	
	void gasUsage();
	void speedLimit();
	void eat();
	void drink();
	default void accelerate() {
		System.out.println("Accelerate quickly...");
		
	}
	

}
