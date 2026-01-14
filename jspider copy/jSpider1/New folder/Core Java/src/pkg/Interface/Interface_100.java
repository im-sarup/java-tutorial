package pkg.Interface;

//Interface
interface Sample
{
	public abstract void un();
	public abstract void pwd();
}

//Implementation class
class Demo implements Sample 
{
	public void un() {
		System.out.println("Username: Im.sarup");
	}
	public void pwd() {
		System.out.println("Password: Sa**@**");
	}
}
public class Interface_100 {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.un();
		d.pwd();
	}

}
