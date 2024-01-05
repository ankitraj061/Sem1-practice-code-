#include <stdio.h>

void printElementsWithDuplicates(int arr[], int n)
{
    // Assuming a reasonable maximum value for array elements
    const int MAX_VALUE = 1000;

    // Array to store the count of occurrences of each element
    int count[MAX_VALUE];

    // Count occurrences of each element
    for (int i = 0; i < n; i++)
    {
        count[arr[i]]++;
    }

    // Print elements with more than two duplicates
    for (int i = 0; i < n; i++)
    {
        if (count[arr[i]] > 1)
        {
            printf("Element with duplicates: %d\n", arr[i]);
            count[arr[i]] = 0; // To avoid printing the same element multiple times
        }
    }
}

int main()
{
    int arr[] = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 9, 1, 1, 1};
    int n = sizeof(arr) / sizeof(arr[0]);

    printf("Elements with more than two duplicates in the array:\n");
    printElementsWithDuplicates(arr, n);

    return 0;
}
