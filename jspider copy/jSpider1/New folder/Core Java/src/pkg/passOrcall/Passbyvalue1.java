package pkg.passOrcall;

public class Passbyvalue1 {
	void display(int a) {
		System.out.println(a);
	}
	public static void main(String[] args) {
		int x = 200;
//		new Passbyvalue1().display(x);
		Passbyvalue1 p = new Passbyvalue1();
		p.display(x);
	}

}
