package pkg.objectClass;

public class Sample3_equals 
{
	public static void main(String[] args) {
		Sample3_equals s = new Sample3_equals();
		Sample3_equals s1 = new Sample3_equals();
		
		System.out.println(s);
		System.out.println(s1);
		
		System.out.println(s.equals(s1));
	}

}
