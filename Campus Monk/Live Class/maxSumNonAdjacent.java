
// Question: Maximum sum of non-adjacent elements => T.C=O(n^2) and S.C=O(n)
import java.util.*;

public class maxSumNonAdjacent {

    //
    public static int maxSub(int i, int arr[]) {
        if (i == 0) {
            return arr[0];
        }
        if (i < 0) {
            return 0;
        }
        //
        int pick = arr[i] + maxSub(i - 2, arr);
        int notPick = 0 + maxSub(i - 1, arr);

        return Math.max(pick, notPick);
    }

    //
    public static int fun(int arr[]) {
        int i = arr.length - 1;

        return maxSub(i, arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = fun(arr);
        System.out.println(ans);
    }
}
