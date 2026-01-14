// C program for implementation of selection sort
// Time Complexity : O(N^2)
// Space Complexity : O(1)
// Best, Avg, Worst Cases : All of them O(N^2)
//--------------------------------------------
#include<stdio.h>

// display function to print values
void display(int arr[], int size){
    for (int i=0; i<size; i++)
        printf("%d ",arr[i]);
    printf("\n");
}

//the main function to drive other function
int main()
{
    int arr[] = {72, 50, 10, 44, 8, 20};
    int size = sizeof(arr)/sizeof(arr[0]);

    printf("Before selection sorting: \n");
    display(arr, size);

    int i, j, min_id, temp;

    //loop to iterate on the array
    for (i=0; i<size-1; i++)
    {
        //try to find minimun element in the array
        min_id = i;
        for(j=i+1; j<size; j++)
        {
            if (arr[j] < arr[min_id])
                min_id = j;       
        }
        // Here we interchange the min element with first one  
        temp = arr[min_id];
        arr[min_id] = arr[i];
        arr[i] = temp;
    }

    printf("\nAfter selection sorting: \n");
    display(arr, size);    
    
    return 0;
}