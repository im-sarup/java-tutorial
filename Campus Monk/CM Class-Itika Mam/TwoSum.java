import java.util.*;

public class TwoSum {
    public static boolean main(String[] args) {
        int l = 0;
        int r = n - 1;

    }
}

// --------------------------------
/*
 * import java.util.*;
 * 
 * public class Main
 * {
 * 
 * public static int[] Two_Sum(int arr[], int target , int n){
 * HashMap<Integer, Integer>mp=new HashMap<>();
 * for(int i=0;i<n;i++){
 * int need=target-arr[i];
 * if(mp.containsKey(need)){
 * return new int[]{mp.get(need),i};
 * }
 * mp.put(arr[i],i);
 * }
 * return new int[]{-1,-1};
 * }
 * public static void main(String[] args) {
 * Scanner sc=new Scanner(System.in);
 * int n=sc.ne
 * int n=sc.nextInt();
 * int arr[]=new int[n];
 * for(int i=0;i<n;i++){
 * arr[i]=sc.nextInt();
 * }
 * int target=sc.nextInt();
 * int ans[]=Two_Sum(arr,target,n);
 * for(int it : ans){
 * System.out.print(it+" ");
 * }
 * }
 * }
 */

// -----------------------------------
// public static boolean Two_Sum(int arr[], int target , int n){
// int l=0;
// int r=n-1;
// while(l<r){
// if(arr[l]+arr[r]==target){
// return true;
// }
// else if(arr[l]+arr[r]<target){
// l++;
// }
// else{
// r--;
// }
// }
// return false;
// }
