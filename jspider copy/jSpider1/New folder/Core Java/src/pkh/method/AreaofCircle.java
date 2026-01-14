package pkh.method;

public class AreaofCircle {
	void area() {
		double pi = 3.142;
		int r = 5;
		double ans = pi * r *r;
		System.out.println("Area of the circle is: "+ ans);
	}
	public static void main(String[] args) {
		new AreaofCircle().area();
	}
}
