package ClassesObjects;

public class Students {

	/*
	 * Objects: anything which you see is an object
	 * 
	 * 
	 * pen properties: length, company, logo, grip, color action/behavior: write
	 * 
	 * human being properties: height, color, weight, name , id, pancard behavior:
	 * running, eating, studying, sleeping, exercies
	 * 
	 * all the male objects grouped together in one class that is class
	 * 
	 * Class: it is group of similar objects Bike will contain all the bike objects
	 * 
	 * Constructor: constructor name is same as class when you create an object of
	 * class, constructor is called Non Parametrized: Parametrized
	 * 
	 * 
	 */

	int studentId;
	String studentName;
	int rollNo;
	int phoneNumber;
	int studentAge;

	public Students(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public Students() {
		System.out.println("I am in Constructor");
	}

	public void walking() {
		System.out.println("Students are walking");
	}

	public void study() {
		System.out.println("Students are studying");
	}

	public void doExercise() {
		System.out.println("Students are exercising");
	}

	public void showStudentInfo() {
		System.out.println("The id is " + studentId + " and name is " + studentName);

	}

}
