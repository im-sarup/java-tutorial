package pkh.method;

public class MethodwithReturnType {
	public static int display() {
		int a = 10;
		return a;
	}
	public static void main(String[] args) {
		int x = display();
		System.out.println("Return value is: " + x);
	}
}
