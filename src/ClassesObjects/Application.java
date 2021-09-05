package ClassesObjects;

public class Application {

	public static void main(String[] args) {
		//how to create an object
		//how to access variables and methods from another class
		//new keyword is used to create an object
		Students student1 = new Students();
		student1.studentId = 1;
		student1.studentName = "Ajay";
		System.out.println(student1.studentId);
		student1.doExercise();
		student1.showStudentInfo();
		
		Students student2= new Students();
		student2.studentId = 2;
		student2.studentName = "Jyothi";
		student2.showStudentInfo();
		Students student3= new Students();
		System.out.println(student3.studentName);
		
		Students std4 = new Students(4, "Iswarya");
		std4.showStudentInfo();
	}
}
