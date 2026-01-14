package pkh.method;

public class MethodwithParameter {
	void add(int x, int y, int z) {
		int ans = x + y + z;
		System.out.println("Ans: " + ans);
	}
	
	public static void main(String[] args) {
		new MethodwithParameter().add(10, 20, 50);
	}

}
