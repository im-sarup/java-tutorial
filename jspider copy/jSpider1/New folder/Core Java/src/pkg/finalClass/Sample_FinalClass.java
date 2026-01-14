package pkg.finalClass;

//final class
final class Sample{
	//final method
	final void disp() {
		//Inherit final method and overload but can't override
	}
}

class Demo //extends Sample is not possible as final class will not inherit
{
	//final void disp();
}
public class Sample_FinalClass {
	public static void main(String[] args) {
		//final variable
		final int x = 10;
//		x = 20;	//final variable can't be re-initilize
	System.out.println(x);
	}
}
