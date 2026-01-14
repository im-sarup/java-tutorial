package pkg.inheritance;

//Super Class
class Father
{
	void building() {
		System.out.println("Father has 2 buildings.");
	}
}

//Sub Class
class Son extends Father
{
	void car() {
		System.out.println("Son has 1 bike and 1 Car.");
	}
}

public class SingleLevel {
	public static void main(String[] args) {
		Son s = new Son();
		s.building();
		s.car();
	}
}
