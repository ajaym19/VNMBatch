package OOPS;

public class Application {

	public static void main(String[] args) {
		ParentClass objParent = new ParentClass();
		objParent.doExercise();
		
		StudentsDemo objStudent = new StudentsDemo();
		objStudent.doExercise();
		objStudent.giveExams();
		
		TeachersDemo objTeachers = new TeachersDemo();
		objTeachers.eatLunch();
		
		Staff objStaff = new Staff();
		objStaff.takeBreak();
		
		MethodOverloadingDemo obj = new MethodOverloadingDemo();
		obj.sum(10, 20);
		obj.sum(10.5f, 11.2f);
		obj.sum(10, 20, 30);
		
	}
}
