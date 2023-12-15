#include <stdio.h>
#include <string.h>
void main()
{
    printf("Enter a string:");
    char a[100];
    gets(a);
    char b[100];
    int i = 0;
    while (a[i] != '\0')
    {
        if (a[i] != 'a' && a[i] != 'e' && a[i] != 'i' && a[i] != 'o' && a[i] != 'u' &&
                a[i] != 'A' && a[i] != 'E' && a[i] != 'I' && a[i] != 'O' && a[i] != 'U')
        {
            printf("%c", a[i]);
        }
        i++;
    }
}

// print only consonent i.e skip the vowels