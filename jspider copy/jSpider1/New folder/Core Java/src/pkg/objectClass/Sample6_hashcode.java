package pkg.objectClass;

public class Sample6_hashcode 
{
	//hashcode method
	public int hascode() {
		return 1234;
	}
	
	public static void main(String[] args) {
		Sample6_hashcode s = new Sample6_hashcode();
		System.out.println(s.hashCode());
	}

}
