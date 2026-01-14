// C program for implementation of quick sort
// Time Complexity : O(n logn)
// Space Complexity : O(1)
// Best, Avg, Worst Cases : All of them O(n logn)
//--------------------------------------------

#include<stdio.h>

// A utility function to swap two elements 
void swap(int *x, int *y)
{
    int temp = *x;
    *x = *y;
    *y = temp;
}

//partition() fun. is used to partion the array
// elements on the left side of pivot elements would be smaller than pivot
// elements on the right side of pivot would be greater than the pivot
int partition(int array[], int low, int high)
{
    int pivot = array[high]; //pivot element is selected right most element in array each time
    int swapIndex = low - 1;

    for(int j=low; j<=high - 1; j++)
    {
        if(array[j] < pivot) //check current element is smaller then the pivot element 
        {
            swapIndex++; //increment swaping index
            swap(&array[swapIndex], &array[j]);
        }
    }
    swap(&array[swapIndex+1], &array[pivot]);
    return (swapIndex+1);
}

void quickSort(int array, int low, int high)
{
    if(low < high)
    {
        // indexPI is partitioning index,
        // partition() func. will return index of partion 
       int indexPI = partition(array, low, high);

        quickSort(array, low, indexPI - 1); //left partition
        quickSort(array, indexPI + 1, high); //right partition
    }
}

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

    printf("Before quick sort:\n");
    display(array, size);

    quickSort(array, 0, size-1);
    printf("Before quick sort:\n");
    display(array, size);

    return 0;
}