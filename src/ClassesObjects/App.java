package ClassesObjects;

public class App {

	public static void main(String[] args) {
		TypesOfVariables std1 = new TypesOfVariables();
		std1.id = 1;
		std1.name = "Ajay";
		std1.schoolName = "IIT";
		System.out.println(std1.id); 
		System.out.println(std1.name); 
		System.out.println(std1.schoolName); //IIT
		
		TypesOfVariables std2 = new TypesOfVariables();
		System.out.println(std2.id); //0
		System.out.println(std2.name); //null
		System.out.println(std2.schoolName); //IIT
		
		TypesOfVariables std3 = new TypesOfVariables();
		std3.schoolName = "Oxford";
		System.out.println(std3.schoolName); // Oxford
		System.out.println(std1.schoolName); //Oxford
		
		TypesOfVariables obj = new TypesOfVariables();
		obj.m4();
		obj.m1();
		//call to static method
		TypesOfVariables.m1();
		TypesOfVariables.showDisclaimer();
		System.out.println(Math.PI);
	}
}
