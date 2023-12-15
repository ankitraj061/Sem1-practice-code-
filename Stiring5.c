#include <stdio.h>
#include <string.h>
int main()
{
    char a[100];
    printf("Enter the string");
    gets(a);
    int count = 0;
    // int size = strlen(a) + 1;

    if ((int)a[strlen(a) - 3] == 49)
    {
        printf("yes");
    }
    else
    {
        printf("no");
    }

    // printf("%d space charecter are avalible.", count);
}

// count no. of space charecter in string