package pkg.map;

import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String[] args) {
//		TreeMap t1 = new TreeMap();
		TreeMap<Object, Object> t1 = new TreeMap<>();
		
		t1.put("a", 4);
		t1.put("b", 2);
		t1.put("c", 1);
		t1.put("e", 5);
		t1.put("d", 3);
		
		System.out.println(t1);
	}
}
