// #include<stdio.h>
// int main()
// {
//     int arr[] = {10, 20, 30, 40 , 50, 60, 70, 80};
//     // int item = 40;
//     int item;
//     printf("Enter your searchine element: ");
//     scanf("%d",&item);
//     // int l = sizeof(arr[0]);
//     int l = 0;
//     int r = sizeof(arr)/sizeof(arr[0]);
//     int mid = l+(r-1)/2;

//     if (r<=l){
//         if (item < arr[mid]){
//         r = mid - 1;
//         mid = l+(r-1)/2;
//         printf("%d found at index %d", item, mid);
//     }
//     else if (item > arr[mid]){
//         l = mid + 1;
//         mid = l+(r-1)/2;
//         printf("%d found at index %d", item, mid);
//     }
//     else if (item == arr[mid]){
//         printf("%d found at index %d", item, mid);
//     }
//     }
//     else
//         printf("%d not found", item);
//     return 0;
// }


#include<stdio.h>
int binarySearch(int arr[], int left, int right, int item)
{
    if (right >= left)
    {
        int mid = left + (right - left)/2;
        if(arr[mid] == item)
            return mid;

        else if(arr[mid] > item)
            return binarySearch(arr, left, mid - 1, item);
        
        else
            return binarySearch(arr, mid + 1, right, item);
    }
    else 
        return -1;

}
int main()
{
    int arr[] = {10, 20, 30, 40, 50, 60 , 70, 80};
    int item = 30;
    int n = sizeof(arr)/sizeof(arr[0]);

    int position = binarySearch(arr, 0, n - 1, item);

    if (position == -1)
        printf("%d not found");
    else
        printf("%d found at index: %d", item, position);
    
    return 0;
}