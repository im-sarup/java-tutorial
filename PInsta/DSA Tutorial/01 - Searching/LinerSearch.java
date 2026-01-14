public class LinerSearch {
    public static void LSearch(int arr[], int item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                System.out.println(item + " found at index : " + i);
                return;
            }
        }
        System.out.println("Not Found");
    }

    public static void main(String[] args) {
        int arr[] = { 12, 15, 8, 25, -3, 19 };
        int item = 25;
        LSearch(arr, item);
    }

}

//////////////////////////////////////
// Time Complexity: O(n)
// Space Complexity: O(1)
