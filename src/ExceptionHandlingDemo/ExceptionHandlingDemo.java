package ExceptionHandlingDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;

public class ExceptionHandlingDemo {

	/*
	 * Exception Handling
	 * book ABC from LIbrary
	 * 
	 * 4 terms
	 * 1- throws
	 * 2. try - any risky code will be here
	 * 3. catch - if try doesnt works, specify what to do here
	 * 4. finally
	 * 
	 * connect to the DB
	 * try: read some data >> close the connection
	 * catch: not success >> close the connection
	 * 
	 * If try works>> catch block wont be executed
	 * Finally will be executed, irrespective of exceptions
	 * 
	 * 2 types of exception
	 * 1. Compile Time: java is helping/warning you at compile time
	 * 2. Run time: java is not giving any warning, directly exception
	 * 
	 */
	static String filePath = "./src/FileHandlingDemo/TestData123";
	public static void main(String[] args) {
		try {
			//trying to reach remote server file
			System.out.println("I am in try block");
			FileReader reader = new FileReader(filePath);
		} catch (Exception e) {
			//handle the exception
			//use local file
			System.out.println("File not found, please check the file");
		} finally {
			System.out.println("I am in finally block");
		}
		
		//System.out.println(5/0);
		//int[] a = new int[2];
		//System.out.println(a[4]);
		String name = null;
		System.out.println(name.length());

	}
}
