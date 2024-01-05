#include <stdio.h>
void removeDuplicate(int a[], int n)
{

    int temp;
    for (int i = 0; i < n; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            if (a[i] == a[j])
            {
                for (int k = j; k < n - 1; k++)
                {
                    temp = a[k];
                    a[k] = a[k + 1];
                    a[k + 1] = temp;
                }
                n--;
                j--;
            }
        }
    }
    
    // int b[] = new int[n];
    // for (int i = 0; i < n; i++)
    // {
    //     b[i] = a[i];
    // }
    // return b;
}
void main()
{
    int n;
    printf("Enter the size of array :");
    scanf("%d", &n);
    int a[n];
    for (int i = 0; i < n; i++)
    {
        printf("Enter the value of %d index ", i);
        scanf("%d", &a[i]);
    }
    int count;
    int b[n];
    for (int i = 0; i < n; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            if (a[i] == a[j])
            {
                b[count] = a[i];
                count++;
            }
        }
    }
    removeDuplicate(b, n);
    for (int i = 0; i < n; i++)
    {
        printf("%d", b[i]);
    }
}