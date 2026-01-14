package pkg.polymorphism;

class Amazon
{
	void buy() {
		System.out.println("Buy");
	}
}

class Nike extends Amazon
{
	void buy() {
		System.out.println("I bought a Shirt");
	}
}

class Levis extends Amazon
{
	void buy() {
		System.out.println("I bought a Jeans");
	}
}

class Stimulator
{
	static void ansim(Amazon a) {
		a.buy();
	}
}

public class RTP_MethodOverride {
	public static void main(String[] args) {
		Nike n = new Nike();
		Levis l = new Levis();
		
		Stimulator.ansim(n);
		Stimulator.ansim(l);
	}
}
