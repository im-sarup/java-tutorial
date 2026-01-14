package pkg.map;
import java.util.HashMap;

public class HashMap1 {
	public static void main(String[] args) {
//		HashMap h1 = new HashMap();
		HashMap<Object, Object> h1 = new HashMap<>();
		h1.put(1, "Apple");
		h1.put(2, "Banana");
		h1.put("Papaya", 3);
		h1.put(3, "Pine Apple");
		h1.put(4, "Orange");
		
		System.out.println(h1);
		
	}
}
