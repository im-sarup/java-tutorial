// Method 1: Brute-force by using count variable -> T.C=O(n2) and S.C=O(1)
// import java.util.*;

// public class majorityElement {
//     public static void main(String[] args) {
//         int nums[] = { 7, 0, 0, 1, 7, 7, 2, 7, 7 };
//         int n = nums.length;
//         int majorityElement = 0;

//         for (int i = 0; i < nums.length; i++) {
//             int count = 0;
//             for (int j = 0; j < nums.length; j++) {
//                 if (nums[i] == nums[j]) {
//                     count++;
//                 }
//                 if (count > (n / 2)) {
//                     majorityElement = nums[i];
//                 }
//             }
//         }
//         System.out.println("Majority Element is: " + majorityElement);
//     }
// }

// Method 2: Optimal Solution (Hashmap) -> T.C= O(n)+O(n) = O(n) and S.C=O(n)
// import java.util.*;

// public class majorityElement {
//     public static int fun(int arr[]) {
//         HashMap<Integer, Integer> mp = new HashMap<>();
//         int n = arr.length;

//         // array -> map insert
//         for (int i = 0; i < n; i++) {
//             mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
//         }
//         // map traverse find > (n/2)
//         for (Map.Entry<Integer, Integer> x : mp.entrySet()) {
//             if (x.getValue() > (n / 2)) {
//                 return x.getKey();
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the size of array: ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         System.out.println("Enter the array elements: ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         // fixed method call
//         int ans = fun(arr);

//         System.out.println("The majority element is: " + ans);

//         sc.close();
//     }
// }

// Method 3: Moon's Voting Algo -> T.C= O(n)+O(n) = O(n) and S.C=O(1)
import java.util.*;

public class majorityElement {

    public static int fun(int arr[]) {
        int n = arr.length;

        int ele = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                ele = arr[i];
            } else if (arr[i] == ele) {
                count++;
            } else {
                count--;
            }
        }

        // verify ans correct
        int count2 = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == ele) {
                count2++;
            }
        }

        // Condition
        if (count2 > (n / 2)) {
            return ele;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // fixed method call
        int ans = fun(arr);

        System.out.println("The mejority element is: " + ans);

        sc.close();
    }
}