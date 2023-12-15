#include <stdio.h>
#include <string.h>
int main()
{
    char a[100];
    printf("Enter the string");
    gets(a);
    int count = 0;
    for (int i = 0; i < strlen(a); i++)
    {
        if ((int)a[i] >= 65 && (int)a[i] <= 90)
        {
            count++;
        }
    }
    printf("%d uppercase charecter are avalible.", count);
}

//count uppercase charecter in a scaned string