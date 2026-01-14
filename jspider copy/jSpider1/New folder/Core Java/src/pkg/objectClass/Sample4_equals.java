package pkg.objectClass;

public class Sample4_equals 
{
	public static void main(String[] args){
		Sample4_equals s = new Sample4_equals();
		Sample4_equals s1 = s;
		
		System.out.println(s);
		System.out.println(s1);
		
		System.out.println(s.equals(s1));
	}

}
