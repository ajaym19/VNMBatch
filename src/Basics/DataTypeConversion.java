package Basics;

public class DataTypeConversion {

	/*
	 * we might need to convert the data type from one to another project1: int
	 * studentID;
	 * 
	 * project2: long studentID;
	 * 
	 * Bucket1 : 5L Bucket2 : 3L TRANSFER WATER B1 >> B2: No B2 >> B1: Yes higher to
	 * lower >> casting is required lower to higher >> casting is not required
	 */

	public static void main(String[] args) {

		long id = 45;
		int id1;
		id1 = (int) id;
		System.out.println(id1);

		// int to float
		int i1 = 45;
		float f1 = i1;
		System.out.println(i1);
		System.out.println(f1);

		// float to int
		float f2 = 45.55f;
		int i2 = (int) f2;
		System.out.println(f2);
		System.out.println(i2);

		// char to int
		char c1 = '4';
		int i3 = c1; // ascii value is assgined
		System.out.println(c1); // 2
		System.out.println(i3); // 2

		// int to char
		int i4 = 45;
		char c2 = (char) i4;
		System.out.println(c2);

		// String to int
		String s1 = "511";
		int i5;

		i5 = Integer.parseInt(s1);
		System.out.println(i5);

		// int to string
		int i6 = 345;
		String s2;
		s2 = Integer.toString(i6);
		System.out.println(s2);

		// Doube to string
		double d1 = 45;
		Double.toString(d1);
		Double.parseDouble(s2);

	}
}
