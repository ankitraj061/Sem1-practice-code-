#include <stdio.h>
#include <string.h>
char returnSameString(int arr[])
{
    return arr;
}
void main()
{
    char a[100];
    printf("Enter a String: ");
    gets(a);
    char result[50] = returnSameString(a);
    printf("%s", result);
}
