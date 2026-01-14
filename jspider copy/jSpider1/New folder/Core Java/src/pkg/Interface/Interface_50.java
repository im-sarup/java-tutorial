package pkg.Interface;

//Interface
interface Sample1
{
	public abstract void un();
	public abstract void pwd();
}

//Abstract class
abstract class Demo1 implements Sample1
{
	public void un() {
		System.out.println("Username: Im.sarup");
	}
	//public abstract void pwd();
}

//Implementation Class
class Test extends Demo1
{
	public void pwd(){
		System.out.println("Passwrod: Sar***");
	}
}

public class Interface_50 {
	public static void main(String[] args) {
		Test t = new Test();
		t.un();
		t.pwd();
	}
}
