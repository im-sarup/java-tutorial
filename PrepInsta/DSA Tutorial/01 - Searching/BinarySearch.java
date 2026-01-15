public class BinarySearch {
    public static int bSearch(int arr[], int left, int right, int item) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == item) {
                return mid;
            } else if (arr[mid] < item) {
                left = mid + 1;
            } else
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
        int item = 70;
        int size = arr.length;

        int position = bSearch(arr, 0, size - 1, item);

        if (position == -1)
            System.out.println("Item not found");
        else
            System.out.println(item + " found at index " + position);
    }
}
