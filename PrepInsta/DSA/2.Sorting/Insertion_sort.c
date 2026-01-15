// Time Complexity : O(n^2)
// Auxiliary Space : O(1)
// --------------------------

#include<stdio.h>

// Function to print array
void display(int arr[], int size){
    for (int i=0; i<size; i++)
        printf("%d ",arr[i]);
    printf("\n");
}

// Main function to run the program 
int main(){
    int arr[] = {8, 6, 4, 20, 24, 2, 10, 12};
    int size = sizeof(arr)/sizeof(arr[0]);

    printf("Before Insertion sort: \n");
    display(arr, size);

    int i, j, key;
    for(int i=1; i<size; i++){
        key = arr[i];
        j = i - 1;

        /* Here the elements in b/w array[0 to i-1] 
        which are greater than key are moved ahead 
        by 1 position each*/ 
        while(j>=0 && arr[j]>key){
            arr[j+1] = arr[j];
            j = j - 1;
        }
        // placing element at its correct position
        arr[j+1] = key;
    }
    printf("After Insertion sort: \n");
    display(arr, size);

    return 0;
}