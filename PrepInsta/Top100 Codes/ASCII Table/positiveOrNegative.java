
// Method 1: Brute Force Method -> T.C=O(1) and S.C=O(1)
import java.util.*;

public class positiveOrNegative {
    // main class

    public static void main(String[] args) {
        // int num = 15;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Condition to check if the number is positive or negative
        if (num > 0)
            System.out.println("The number is Positive");
        else if (num < 0)
            System.out.println("The number is Negitive");
        else
            System.out.println("The number is Zero");
    }
}

// Method 2: Nested if-else
// import java.util.*;

// public class positiveOrNegative {

// // Main Class
// public static void main(String[] args) {
// // Scanner object create
// Scanner sc = new Scanner(System.in);

// System.out.print("Enter a number: ");
// int num = sc.nextInt();

// // Nested if-else
// if (num >= 0) {
// if (num == 0) {
// System.out.println("Zero");
// } else {
// System.out.println("Positive");
// }
// } else {
// System.out.println("Negative");
// }
// }
// }

// Method 3: Ternary Operator [(condition) ? (if TRUE: action) : (if FALSE:
// action)] -> T.C=O(1) and S.C=O(1)
// import java.util.*;

// public class positiveOrNegative {
// // main class
// public static void main(String[] args) {
// // Scanner object create
// Scanner sc = new Scanner(System.in);

// System.out.print("Enter a number: ");
// int num = sc.nextInt();

// if (num == 0) {
// System.out.println("Zero");
// } else {
// String result = (num > 0) ? ("Positive") : ("Negative");
// System.out.println(result);
// }
// }
// }