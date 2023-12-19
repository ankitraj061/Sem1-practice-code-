#include <stdio.h>
// static int *b[5];
void pointerFunction(int *b[0])
{

    for (int i = 0; i < 3; i++)
    {
        printf("%d ", *b[0]);
    }
}
int main()
{
    int a[] = {1, 4, 6};
   
    pointerFunction(a);
}