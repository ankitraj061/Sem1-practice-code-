#include <stdio.h>
#include <string.h>
void main()
{
    char a[] = "hello/0";
    int str = strlen(a);
    printf("%d", str);
    printf("\n%d", sizeof(a));
    // char b[2];
    // b[1] = a[1];
    // int str1 = strlen(b);
    // printf("%d", str1);
}