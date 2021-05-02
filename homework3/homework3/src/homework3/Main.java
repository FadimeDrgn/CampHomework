package homework3;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.id= 1;
		student.userId = 1;
		student.firstName = "Fadime";
		student.lastName = "Durgun";
		student.email = "asdfgh";
		student.password = "1234rfdcvh";
		student.attendanceOfPercentage = 58;
		
		System.out.println(student.firstName);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		
		Instructer instructor = new Instructer();
		instructor.id= 1;
		instructor.userId = 2;
		instructor.firstName = "Fadime";
		instructor.lastName = "Durgun";
		instructor.email = "asdfgh";
		instructor.password = "1234rfdcvh";
		
		
		System.out.println(instructor.firstName);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		
		
	}

}
