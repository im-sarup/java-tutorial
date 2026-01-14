package pkh.method;

public class MethodParameterReturnType {
	public static int display(int x, int y, int z) {
		int ans = x + y + z;
		return ans;
	}
	public static void main(String[] args) {
		int result = display(10, 20, 50);
		System.out.println("Ans is : " + result);
	}
}
