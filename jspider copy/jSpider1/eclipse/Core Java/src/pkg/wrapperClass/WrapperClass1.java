package pkg.wrapperClass;

public class WrapperClass1 {

	public static void main(String[] args) {
		Integer i = new Integer(10);	//boxing -> Premitive data type to wrapper class object
		System.out.println(i);
		
		int a = i;						//Unboxing -> Wrapper class Object to Premitive type data
		System.out.println(a);
		
		Character c = new Character('j');
		System.out.println(c);
		
		char c1 = c;
		System.out.println(c1);
	}
}
