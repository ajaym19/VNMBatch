package Basics;

public class DataTypes {

	/*
	 * to store any value in java we create a variable
	 * to create a variable, its compulsory to define the data type
	 * data type indicates what kind of data you want to store inthat variable
	 * 
	 * JAVA is a case sensitive language
	 * Data Type:
	 * A. Primitive:
	 * 1. Integral: 
	 * 		Integer: byte, short, int, long
	 * 		Floating: float, double
	 * 2. Character based: char
	 * 3. boolean: boolean
	 * 
	 * B.Non Primitive
	 * String, Array
	 * 
	 */
	
	public static void main(String[] args) {
		int phoneNumber = 545455;;
		//byte -128 to 127
		byte a = 12;
		long l = 34343;
		int x;
		System.out.println(a); //12
		System.out.println("l"); //l, 34343
		System.out.println(l); 	//34343
		System.out.println("x");
		
		float f1 = 45.50f;
		double d1 = 55.50;
		System.out.println(d1);
		System.out.println(f1);
		//int x1 = 45.50; not allowed
		//int x2 = "ajay"; not allowed
		
		//what is a character
		//a, ajay, 1, @, whatever u see on keybard is character
		char c1 = 'a';
		char c2 = '@';
		char c3 = '1';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		//sequence of characters is called as String
		String name = "ajay";
		
		//boolean
		boolean isPresent = false;
		System.out.println(isPresent);
		
		//  boolean bb1 = 1 //true
		 // boolean bb2 = 0 //false
		  boolean bb3 = true; 
		  boolean bb4 = false; //false
		 System.out.println(bb4);
	}
}
