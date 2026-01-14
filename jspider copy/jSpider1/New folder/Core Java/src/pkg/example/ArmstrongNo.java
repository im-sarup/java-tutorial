package pkg.example;

public class ArmstrongNo {
	public static void main(String[] args) {
		int n = 153; //15, 
		int copy = n;
		int sum = 0; //0, 27, 
		
		while(n != 0) {
			int rem = n % 10;
			sum = sum + (rem * rem * rem);
			n = n / 10; //15
		}
		
		if(sum == copy) {
			System.out.println(copy + ": is an armstrong Number");
		}
		else {
			System.out.println(copy + ": is not an armstrong Number");
		}

	}

}
