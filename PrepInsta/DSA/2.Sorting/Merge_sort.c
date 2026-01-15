// C program for implementation of merge sort
// Time Complexity : O(n logn)
// Space Complexity : O(N)
// Best, Avg, Worst Cases : All of them O(n logn)
//--------------------------------------------

#include<stdio.h>

/* Function to display the array */
void display(int array[], int size)
{
    int i=0;
    for(i=0; i<size; i++)
        printf("%d ",array[i]);
    printf("\n");
}

//Main function to run the program
int main()
{
    int array[] = {70, 90, 10, 30, 50, 20, 60};
    int size = sizeof(array)/sizeof(array[0]);

    printf("Before merge sort:\n");
    display(array, size);

    mergeSort();
    printf("Before merge sort:\n");
    display(array, size);

    return 0;
}