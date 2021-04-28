package homework2;

public class Teacher {
	
	public Teacher() {
		System.out.println("Costructer yapýsý eklendi.");
	}
	
	public Teacher(int id, String name, String lastName) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
	}
	
    int id;
	String name;
	String lastName;
}
