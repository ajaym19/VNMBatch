package CollectionsDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	/*
	 * HashSet:
	 * Insertion order is not maintained
	 * Internally it uses a concept of Hashing
	 * Hashing is widely used in Search Operations
	 * Hashset does not allow duplicate elements
	 */
	
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		System.out.println(set);
		set.add("Ajay");
		set.add("Jyothi");
		set.add("Iswarya");
		set.add("Iswarya");
		System.out.println(set);
		System.out.println("Printing using for each loop");
		for(String a : set) {
			System.out.println(a);
		}
		
		System.out.println("Learning Iterator");
		Iterator<String> it = set.iterator();
		//hasNext(): will inform if next element is present
		//next(): it will give you the next element
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		/*
		 * HW
		 * 1. Create an array list, convert it to array
		 * 2. Create an array, convert it to arraylist
		 * 3. Sort an arraylist increasing order
		 * 4. given an array, move all the 0's in the start and rest will reamin same
		 * eg: ip: [2,0,4,0,1,8,0,9] OP: [0,0,0,2,4,1,8,9]
		 * 5. Copy all the elements of arraylist into another
		 * 6. Given a set with duplicates, remove the duplicate
		 * 
		 * IP: set: [5,4,7,5,8,9,8,5]
		 * OP: [5,4,7,8,9]
		 * 
		 */
		
		
	}
}
