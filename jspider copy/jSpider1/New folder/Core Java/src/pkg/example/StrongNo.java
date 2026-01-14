package pkg.example;

class Sample {
	void display(int n) {
		int copy = n;
		int sum = 0;
		
		while(n != 0) {
			int rem = n % 10;
			int fact = 1;
			for(int i=2; i<=rem; i++) {
				fact = fact * i;
			}
			sum = sum + fact;
			n = n/10;
		}
		System.out.println(sum);
		
		if(copy == sum) {
			System.out.println(copy + ": Yes, it is a Strong Number");
		}
		else{
			System.out.println(copy + ": No, it is not a Strong Number");
		}
	}
}
public class StrongNo{
	public static void main(String[] args) {
		Sample s = new Sample();
		s.display(232);
//		s.display(145);
	}
}
