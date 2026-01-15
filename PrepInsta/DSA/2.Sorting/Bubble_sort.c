#include<stdio.h>
// Function to print array 
void display(int arr[], int size){
    for (int i=0; i<size; i++)
        printf("%d ",arr[i]);
    printf("\n");
}

// Main function to run the program
int main(){
    int arr[] = {46, 6, 4, 2, 24};
    int size = sizeof(arr)/sizeof(arr[0]);

    printf("Before bubble sort: \n");
    display(arr, size);

    int i, j, temp;
    for (i=0; i<size-1; i++){

        // Since, after each iteration right-most i elements are sorted  
        for(j=0; j<size-i-1; j++){
            if(arr[j] > arr[j+1]){
                temp = arr[j];  // swap the element
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
    printf("After bubble sort: \n");
    display(arr, size);

    return 0;
}

