package ClassesObjects;

public class TypesOfVariables {

	/*
	 *Variables:
	 *1. Global Variables: these variables are accessible throughout the class
	 *declared inside the class and outside of any method
	 *	a. Instance: with no static keyword
	 *	b. Static: with static keyword
	 *2. Local Variables: created within a class
	 *and inside a method
	 */
	
	 int id;
	 String name;
	 int age;
	 static String schoolName;
	 
	
	 public void showSchoolName() {
		
		System.out.println(schoolName);
	}
	 
	public static void main(String[] args) {
		m1();
		
		
	}
	
	public static void m1() {
		int id1 = 0;
		System.out.println(id1);
		//System.out.println(name);
	}
	
	public void m4() {
		showSchoolName();
		m1();
	}
	
	public static void showDisclaimer() {
		System.out.println("Writing disclaimer");
	}
}
