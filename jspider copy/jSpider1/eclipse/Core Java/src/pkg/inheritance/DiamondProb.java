package pkg.inheritance;

interface Sample{
	abstract void un();
}

interface Demo{
	abstract void pwd();
}

class Test implements Sample, Demo
{
	public void un() {
		System.out.println("UserName: Im.sarup");
	}
	public void pwd() {
		System.out.println("Password: S****@***");
	}
}
public class DiamondProb {

	public static void main(String[] args) {
		Test t = new Test();
		t.un();
		t.pwd();
	}
}
