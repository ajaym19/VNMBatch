package CollectionsDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	/*
	 * ArrayList:
	 * is a class implementing List Interface
	 * internal working of ArrayList is exactly same as Array
	 * but with dynamic size
	 * 
	 * Properties/Rules:
	 * 1. Insertion Order is maintained
	 * 2. Whenever we add an element, it will be added in the last
	 * 3. Duplicates are allowed
	 * 4. Size is managed dynamically
	 */
	
	public static void main(String[] args) {
		//create a list
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println(list);
		
		//adding an element
		list.add(11);
		list.add(14);
		list.add(12);
		list.add(10);
		list.add(12);
		System.out.println(list);
		
		list.add(1, 50);
		System.out.println(list);
		
		//how to get individual element
		 Integer a = list.get(1);
		System.out.println(a);
		System.out.println(list.get(1));
		
		list.set(1, 501);
		System.out.println(list);
		
		List<Integer> newList = new ArrayList<Integer>();
		newList.add(101);
		newList.add(102);
		newList.add(103);
		
		//add all the elements from one list to other
		//list.addAll(newList);
		list.addAll(2, newList);
		System.out.println(newList);
		System.out.println(list);
		System.out.println(list.isEmpty());
		//list.clear();
		System.out.println(list.isEmpty());
		System.out.println(list.contains(501));
		list.remove(1);
		System.out.println(list);
		 int listSize = list.size();
		System.out.println("Size of the List is " +listSize);
		list.removeAll(newList);
		System.out.println(list);
		
		//how to print all values one by one
		System.out.println("Printing each element using for loop");
		for(int i = 0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("Learning Indexes");
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(101);
		list2.add(102);
		list2.add(103);
		System.out.println(list2);
		System.out.println(list2.get(1));
		list2.remove(1);
		System.out.println(list2);
		System.out.println(list2.get(1));
		
		
	}
}
