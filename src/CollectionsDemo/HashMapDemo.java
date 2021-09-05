package CollectionsDemo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	/*
	 * HashMap:
	 * is a class implements MAP interface
	 * we store the key and value pair
	 * a key and value together is called as a Bucket/Pair/Entry
	 * Multiple entries/bucket together is called as Entry Set
	 * 
	 * Properties:
	 * Duplicate values are allowed
	 * Null values are allowed with duplicates
	 * 
	 * Duplicate key is not allowed, 
	 * 	if added, will work as an Update
	 * Null key is allowed but only once
	 */
	
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Ajay");
		map.put(2, "Iswarya");
		map.put(3, "Jyothi");
		System.out.println(map);
		System.out.println(map.get(21));
		map.put(4, "Jyothi");
		map.put(5, null);
		map.put(6, null);
		System.out.println(map);
		map.put(1, "Karishma");
		System.out.println(map);
		map.put(null, "Karishma");
		map.put(null, "Katrina");
		System.out.println(map);
		System.out.println(map.containsKey(22));
		//map.entrySet();
		
		System.out.println(map.keySet());
		Set<Integer> set = map.keySet();
		//how to print element of set
		
		System.out.println("Printing using for each");
		for(Entry<Integer, String> a: map.entrySet()) {
			System.out.println("Key is "+ a.getKey() + " Value is "+a.getValue());
		}
		
	}
}
