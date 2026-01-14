package pkg.example;

public class StrongNo1 {
	public static void main(String[] args) {
		int n = 145;
		int copy = n;
		int sum = 0;
		
		while(n != 0) {
			int rem = n % 10;
			int fact = 1;
			
			for(int i=2; i<=rem; i++) {
				fact = fact * i;
			}
			sum = sum + fact;
			n = n / 10;
		}
		System.out.println(sum);
		
		if(copy == sum) {
			System.out.println("Yes, it is a Strong Number");
		}
		else{
			System.out.println("No, it is not a Strong Number");
		}
	}

}
