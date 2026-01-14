package pkg.map;

import java.util.LinkedHashMap;

public class LinkedHashMap1 {
	public static void main(String[] args) {
//		LinkedHashMap l1 = new LinkedHashMap();
		LinkedHashMap<Object, Object> l1 = new LinkedHashMap<> ();
		l1.put(1, "Apple");
		l1.put(2, "Banana");
		l1.put("Papaya", 3);
		l1.put(3, "Pine Apple");
		l1.put(4, "Orange");
		
		System.out.println(l1);
	}
}
