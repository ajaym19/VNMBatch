package Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		/*
		 * Array:
		 * to store multiple values of similar kind
		 * 
		 * Array has 3 parts:
		 * 1. Declaration
		 * 2. Instantiation
		 * 3. Initialization
		 * 
		 * elements are stored sequentially in memory
		 * Indexing is maintained
		 * by default all the elements are init by 0 for integers and null for string
		 * 
		 * 
		 */
		
		int[] studentId; //Declaration
		studentId = new int[5]; //instantiation
		studentId[0] = 10; //init
		studentId[2] = 2;
		System.out.println(studentId[0]);
		System.out.println(studentId[2]);
		System.out.println(studentId[3]);
		int size = studentId.length;
		System.out.println("Printing all the values using for loop");
		for(int i = 0; i < size; i++) {
			System.out.println(studentId[i]);
		}
		
		System.out.println();
		//studentId[5] = 101;
		
		//Declaration and instantiation
		int[] teacherid = new int[5];
		
		//Declaration and instantiation and init
		int[] staffId = {11,12,13,14};
		System.out.println(staffId.length);
		
		//Collections
	}
}
