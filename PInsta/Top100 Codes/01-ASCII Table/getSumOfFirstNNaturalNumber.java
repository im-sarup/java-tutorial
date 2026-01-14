import java.util.*;

// public class getSumOfFirstNNaturalNumber {

//     public static void main(String[] args) {

//         // int num = 10;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         int sum = 0;
//         for (int i = 0; i <= num; i++) {
//             sum += i;
//         }
//         System.out.println("Sum of first " + num + " natural number is : " + sum);
//     }
// }

// public class getSumOfFirstNNaturalNumber {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         System.out.println("sum of first " + num + "-natural number is: " + num * (num + 1) / 2);
//     }
// }

public class getSumOfFirstNNaturalNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = getSum(num);

        System.out.println("sum of first " + num + "-natural number is: " + sum);
    }

    static int getSum(int n) {
        if (n == 0)
            return 0;
        return n + getSum(n - 1);
    }
}
