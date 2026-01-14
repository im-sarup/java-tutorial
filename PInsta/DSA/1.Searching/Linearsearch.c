// Time Complexity : O(N)
// Space Complexity : O(1)
// Auxiliary Space Complexity : O(N) due to function call stack
// --------------------------------------------------------------------------

// Method 1: BRUTE FORCE METHOD-----------------------------------------------
// #include<stdio.h>
// int main()
// {
//     int i,item=40;
//     int arr[] = {10, 20, 30 ,40 ,50};
//     int len = sizeof(arr);

//     for (int i=0; i<len; i++)
//     {
//         if (arr[i]==item)
//         {
//             printf("%d found at index %d", item, i);
//         }
//     }
//     return 0;
// }


// Method 2: BRUTE FORCE METHOD-----------------------------------------------***
#include<stdio.h>

void LinearSearch(int arr[], int len, int item)
{
    for(int i=0;i < len;i++)
    {
        if(arr[i] == item)
        {
        printf("%d Found at index %d", item, i);
        return;
        }
    }
    printf("Not Found");
}

int main() 
{
    int arr[] = {10, 20, 30, 40, 50};

    // calculating length of array 
    int len = sizeof(arr)/sizeof(arr[0]);

    // item to be searched
    int item = 40;
    LinearSearch(arr, len, item);

    return 0;
}

// Method 3: RECURSIVE METHOD-----------------------------------------------***

// #include<stdio.h>

// int LinearSearch(int arr[], int index, int item)
// {
//     if(arr[index] == item)
//         return index;
//     else if (index == -1)
//         return -1;
    
//     LinearSearch(arr, index - 1, item);
// }

// int main() 
// {
//     int arr[] = {10, 20, 30, 40, 50};

//     // calculating length of array 
//     int len = sizeof(arr)/sizeof(arr[0]);

//     // item to be searched
//     int item = 30;
    
//     int index = LinearSearch(arr, len - 1, item); //index=> 4->3->2->1->0->-1

//     if(index >= 0)
//         printf("Item found at %d index", index);
//     else
//         printf("Item not found");
        
//     return 0;
// }

