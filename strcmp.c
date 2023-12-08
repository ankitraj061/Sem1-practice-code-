#include <stdio.h>
#include <string.h>
int main()
{
    int n, m;
    printf("Enter the length of str1\n");
    scanf("%d", &n);
    char str1[n + 1];
    printf("Enter elements of str1\n");
    gets(str1);

    printf("Enter the length of str2\n");
    scanf("%d", &m);
    char str2[m + 1];
    printf("Enter elements of str2\n");
    gets(str2);

    int count = 0;
    if (strlen(str1) != strlen(str2))
    {
        printf("not same");
    }
    else
    {

        for (int i = 0; i < strlen(str1); i++)
        {
            if (str1[i] == str2[i])
            {
                count = 1;
            }
            else
            {
                count = 0;
            }
        }
        if (count == 1)
        {
            printf("both have same value");
        }
        else
        {

            printf("both have not same value");
        }
    }

    return 0;
}