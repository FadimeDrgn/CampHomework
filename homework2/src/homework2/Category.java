package homework2;

public class Category {
	
	public Category() {
		System.out.println("Costructer yapýsý eklendi.");
	}
	
	public Category(int id, String categoryName) {
		this.id = id;
		this.categoryName = categoryName;
	}
	
	int id;
	String categoryName;	
}
