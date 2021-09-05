package Basics;

public class StringDemo {

	/*
	 * String class is final
	 * String objects are immutable in JAVA
	 * cannot be updated once created
	 * 
	 * String Builder and String Buffer
	 * These are mutable classes
	 * 
	 * Builder supports Multi Threading
	 * Buffer does not support Multi Threading
	 */
	public static void main(String[] args) {
		String name = "Ajay";
		System.out.println(name);
		name = name.concat(" Trainer");
		System.out.println(name);
		
		StringBuilder builder = new StringBuilder("Shweta");
		System.out.println(builder);
		builder.append(" Amle");
		System.out.println(builder);
		System.out.println(builder.length());
		System.out.println(builder.reverse());
		System.out.println(name.equals(builder));
		
	}
}
