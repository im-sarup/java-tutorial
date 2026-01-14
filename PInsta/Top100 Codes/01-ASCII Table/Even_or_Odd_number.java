import java.util.*;

// public class Even_or_Odd_number {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         if (num % 2 == 0)
//             System.out.println(num + " is an Even Number");
//         else
//             System.out.println(num + " is an Odd Number");
//     }
// }

// Method 2 : Using Ternary Operator
// public class Even_or_Odd_number {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         String ans = num % 2 == 0 ? " is an Even number" : " is an Odd number";

//         System.out.println(num + ans);
//     }
// }

// Method 3: Bitwise Operator
public class Even_or_Odd_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isEven(num))
            System.out.println(" is an Even No");
        else
            System.out.println(" is an odd no");

    }

    static bool isEven(int num) {
        // n & 1 is 1, then odd, else even
        return (!(number & 1));
    }
}