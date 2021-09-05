package OOPS;

public class StudentsDemo extends ParentClass {

	final int  id = 5;
	String color = "White";
	public static void main(String[] args) {
		StudentsDemo obj = new StudentsDemo();
		//obj.giveExams();
		obj.printColor();
		
		
	}
	
	public void giveExams() {
		System.out.println("Students are giving exams");
		//id = 10;
		System.out.println(id);
	}
	
//	public void doExercise() {
//		System.out.println("Students doing exercising");
//	}
	
	
	public void printColor() {
		System.out.println(color);
		System.out.println(super.color);
	}
}
