import java.util.*;

// Method 1: Brute Force
public class Find_Positive_or_Negative {
    public static void main(String[] args) {
        // int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num > 0)
            System.out.println("Positive");
        else if (num < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");

    }
}

// Method 2: Using Nested if-else Statements

// public class Find_Positive_or_Negative {

// public static void main(String[] args) {
// int num = -1;

// if (num >= 0) {
// if (num > 0)
// System.out.println("Positive");
// else
// System.out.println("Zero");
// } else
// System.out.println("Negative");
// }
// }

// Method 3:Using Ternary Operator

// public class Find_Positive_or_Negative {

// public static void main(String[] args) {
// int num = 2;
// if (num == 0)
// System.out.println("Zero");
// else {
// String ans = num > 0 ? "Positive" : "Negative";
// System.out.println(ans);
// }

// }
// }