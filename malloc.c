#include <stdio.h>
#include <stdlib.h>

int main()
{
    int *dynamicArray;

    // Allocate memory for an array of 3 integers
    dynamicArray = (int *)malloc(3 * sizeof(int));

    if (dynamicArray != NULL)
    {
        // Use the allocated memory
        dynamicArray[0] = 1;
        dynamicArray[1] = 2;
        dynamicArray[2] = 3;

        // Print values
        for (int i = 0; i < 3; ++i)
        {
            printf("%d ", dynamicArray[i]);
        }

        // Deallocate the memory
        free(dynamicArray);
    }
    else
    {
        // Allocation failed
        printf("Memory allocation failed!\n");
    }

    return 0;
}