package pkg.accessSpecifier;

class BwTheClass1  {
	public void pub() {
		System.out.println("I'm Public Access Specifier");
	}
	
	protected void protect(){
		System.out.println("I'm Protected Access Specifier");
	}
	
	void defo(){
		System.out.println("I'm Default/Package Access Specifier");
	}
	
	private void priv(){
		System.out.println("I'm Private Access Specifier");
	}
}
public class BwTheClass{
	public static void main(String[] args) {
		BwTheClass1 b = new BwTheClass1();
		b.pub();
		b.protect();
		b.defo();
		//b.priv();	// This line will cause an error since priv() is private and cannot be accessed from BwTheClass
	}
}
