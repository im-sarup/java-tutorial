package pkg.abstraction;

//abstract class
abstract class Sample1
{
	abstract void uname();
	abstract void pword();
}

//abstract method
abstract class Demo1 extends Sample1
{
	void uname() {
		System.out.println("Username: Im.sarup");
	}
	//abstract void pword();
}

//Implementation class
class Test extends Demo1
{
	void pword() {
		System.out.println("Password: S**@**");
	}
}
public class Abstraction_50 {
	public static void main(String[] args) {
		Test t = new Test();
		t.uname();
		t.pword();
	}

}
