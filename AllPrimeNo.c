#include <stdio.h>
#include <math.h>
int is_prime(int n)
{
    int flag = 0;
    for (int i = 1; i <= sqrt(n); i++)
    {
        if (n % i == 0)
        {
            flag++;
        }
    }
    if (flag == 1)
        return 1;
    else
        return 0;
}

void main()
{
    int n;
    printf("Enter a number:");
    scanf("%d", &n);
    for (int i = 2; i < n / 1; i++)
    {
        if (n % i == 0)
        {
            if (is_prime(i))
            {
                printf("%d ", i);
            }
        }
    }
}