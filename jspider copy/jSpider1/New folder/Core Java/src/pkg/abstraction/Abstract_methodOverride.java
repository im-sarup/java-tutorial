package pkg.abstraction;

//Interface
interface Amazon
{
	public abstract void buy();
}

//
class Nike implements Amazon
{
	public void buy() {
		System.out.println("I bought a Shirt");
	}
}

//
class Levis implements Amazon
{
	public void buy() {
		System.out.println("I bought a Jeans");
	}
}

class Stimulator
{
	static void ansim(Amazon a) {
		a.buy();
	}
}

public class Abstract_methodOverride {
	public static void main(String[] args) {
		Nike n = new Nike();
		Levis l = new Levis();
		
		Stimulator.ansim(n);
		Stimulator.ansim(l);
	}
}
