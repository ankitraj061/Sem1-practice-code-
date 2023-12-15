#include <stdio.h>
#include <string.h>
void main()
{
    char a[100];
    printf("Enter the  string values\n");
    gets(a);
    // scanf("^[\n%s]", &a);
    char b[5] = {
        'a',
        'e',
        'i',
        'o',
        'u',
    };
    int count = 0;
    for (int i = 0; i < 5; i++)
    {
        for (int j = 0; j < strlen(a); j++)
        {
            if (b[i] == a[j])
            {
                count++;
            }
        }
        printf("%c repeats %d times.\n", b[i], count);
        count = 0;
    }
}