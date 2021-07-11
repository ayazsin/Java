package day16statickeyword;

public class Student {
	
	String name;
	String id;
	int grade;
	int registrationYear;
	static int counter = 1000;
	
	public void setId() {
		
		counter++;
		id = "" + registrationYear + grade + counter;
		
	}

	public Student(String name, int grade, int registrationYear) {
		this.name = name;
		this.grade = grade;
		this.registrationYear = registrationYear;
		setId();
		
	}
	

}
