package pkg.abstraction;

//abstrace class
abstract class Sample
{
	abstract void un();
	abstract void pwd();
}

//Implementation Class
class Demo extends Sample
{
	void un() {
		System.out.println("Username: Im.sarup");
	}
	void pwd()
	{
		System.out.println("Password: S***@***");
	}
}

public class Abstraction_100 {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.un();
		d.pwd();
	}
}
