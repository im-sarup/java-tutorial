
// Method 1: Brute Force -> T.C=O(1) and S.C=O(1)
// import java.util.*;

// public class evenOrOdd {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         if (num % 2 == 0)
//             System.out.println("Even Number");
//         else
//             System.out.println("Odd Number");
//     }
// }

// Method 2: Ternary Operator -> T.C=O(1) and S.C=O(1)
// import java.util.*;

// public class evenOrOdd {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();

//         String result = (num % 2 == 0) ? ("Even Number") : ("Odd Number");
//         System.out.println(result);
//     }
// }

// Method 3: Bitwise Operator
import java.util.*;

public class evenOrOdd {
    static bool isEven(int num) {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isEven(num))
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }
}
