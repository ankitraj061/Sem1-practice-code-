#include <stdio.h>
#include <stdlib.h>

int main()
{
    // Example with calloc
    int *array = (int *)calloc(5, sizeof(int));

    if (array != NULL)
    {
        printf("Memory allocated using calloc:\n");
        for (int i = 0; i < 5; ++i)
        {
            printf("%d ", array[i]);
        }
        printf("\n");

        free(array); // Deallocate memory
    }
    else
    {
        printf("Memory allocation failed!\n");
    }

    // Example with realloc
    int *dynamicArray = (int *)malloc(3 * sizeof(int));

    if (dynamicArray != NULL)
    {
        printf("Memory allocated using malloc:\n");
        dynamicArray[0] = 1;
        dynamicArray[1] = 2;
        dynamicArray[2] = 3;

        for (int i = 0; i < 3; ++i)
        {
            printf("%d ", dynamicArray[i]);
        }
        printf("\n");

        // Reallocate memory for an array of 5 integers
        int *resizedArray = (int *)realloc(dynamicArray, 5 * sizeof(int));

        if (resizedArray != NULL)
        {
            printf("Memory reallocated using realloc:\n");
            for (int i = 0; i < 5; ++i)
            {
                printf("%d ", resizedArray[i]);
            }
            printf("\n");

            free(resizedArray); // Deallocate reallocated memory
        }
        else
        {
            printf("Memory reallocation failed!\n");
            free(dynamicArray); // Original memory is still valid
        }
    }
    else
    {
        printf("Memory allocation failed!\n");
    }

    return 0;
}
