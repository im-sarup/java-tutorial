package pkg.passOrcall;

public class PassbyRef {
	int x = 10;
	static void display(PassbyRef p1) {
		System.out.println(p1.x);
	}
	
	public static void main(String[] args) {
		PassbyRef r = new PassbyRef();
		display(r);
	}
}
