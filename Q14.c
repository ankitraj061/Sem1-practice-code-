#include <stdio.h>
int main()
{
    int arr[5];
    int i, j;

    printf("Enter 5 integers:\n");
    for (i = 0; i < 5; i++)
    {
        scanf("%d", &arr[i]);
    }

    printf("Duplicate elements:\n");
    for (i = 0; i < 5; i++)
    {
        // Check if arr[i] is a duplicate
        int isDuplicate = 0;
        for (j = 0; j < i; j++)
        {
            if (arr[i] == arr[j])
            {
                isDuplicate = 1;
                break;
            }
        }
        // If arr[i] is a duplicate and hasn't been printed yet
        if (isDuplicate)
        {
            // Check if it has been printed before
            int isPrinted = 0;
            for (j = 0; j < i; j++)
            {
                if (arr[i] == arr[j])
                {
                    isPrinted = 1;
                    break;
                }
            }
            // // If not printed, print the duplicate element
            if (!isPrinted)
            {
                printf("%d\n", arr[i]);
            }
        }
    }
}