package pkg.map;
import java.util.LinkedHashMap;
public class LinkedHashMap1 {

	public static void main(String[] args) {
		LinkedHashMap h1 = new LinkedHashMap();
		h1.put(1, "Hello");
		h1.put(2, "Hii");
		h1.put("Bye", 3);
		h1.put(3, "Good Bye");
		h1.put(4, "Tata");
		
		System.out.println(h1);

	}

}
