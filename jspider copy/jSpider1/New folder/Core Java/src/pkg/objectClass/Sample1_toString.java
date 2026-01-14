package pkg.objectClass;

public class Sample1_toString extends Object
{
	//toString method
	public String toString() {
		return "Hello Java";
	}
	
	public static void main(String[] args) {
		Sample1_toString s = new Sample1_toString();
//		System.out.println(s.toString());
		
//		or
		
		System.out.println(s);
	}
}
