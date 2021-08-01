package day30exceptionsinterfacesitiratorscollections;

public interface Music {
	
	String system = "Surround";
	int price = 2000;
	
	void sound();
	void tune();
	void eat();
	void drink();
	static void volume() {
		System.out.println("Do not listen to the music with high volume");
	}

}
