package pkh.method;

public class AreaofCircle3 {
	static void area() {
		double pi = 3.142;
		int r = 5;
		double ans = pi * r * r;
		System.out.println("Area of the circle is: " + ans);
	}
}

class Display
{
	public static void main(String[] args) {
		AreaofCircle3.area();
	}
}
