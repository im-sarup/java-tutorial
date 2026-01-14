package pkg.finalClass;

//final class
final class Snake{
	void cobra() {
		System.out.println("bus bus bus ...");
	}
}

class Snake1{
	void kingCobra() {
		System.out.println("busss busss busss ...");
	}
}
public class Sample1_FinalClass {
	public static void main(String[] args) {
		Snake s = new Snake();
		Snake1 s1 = new Snake1();
		
		s.cobra();
		s1.kingCobra();
		
		final int a = 9465;
//		a = 1000;
		System.out.println(a);
	}

}
