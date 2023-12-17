#include <stdio.h>
void main()
{
    int arr[5] = {2, 1, 4, 5, 7};
    int *p;
    for (int i = 0; i < 5; i++)
    {

        p = &arr[i];
        printf("%d\n", p);
    }
}