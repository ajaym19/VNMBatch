package CollectionsDemo;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(101);
		list.add(102);
		list.add(103);
		System.out.println(list);
		list.addFirst(501);
		list.addLast(510);
		System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
	}
}
