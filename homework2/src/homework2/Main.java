package homework2;

public class Main {

	public static void main(String[] args) {
		
		Teacher teacher1 = new Teacher();
		teacher1.id =1;
		teacher1.name = "Engin";
		teacher1.lastName = "DEM�RO�";
		
		Teacher[] teachers = {teacher1};
		
		for (Teacher teacher :teachers) {
			System.out.println(teacher.name);
		}

		System.out.println("E�itmen say�s�: " +teachers.length);
		
		System.out.println("-------------");
		
		Category category1 = new Category();
		category1.id =1;
		category1.categoryName = "Programlama";
		
		Category category2 = new Category(2, "Yaz�l�m");
		
		Category[] categories = {category1, category2};
		
		for (Category category : categories) {
			System.out.println(category.categoryName);
		}
		
		System.out.println("Kategori say�s�: " +categories.length);
	}

}
