#include <stdio.h>
#include <math.h>
void main()
{
    int a = 100010;
    int digit;
    int i = 0;
    int sum = 0;
    while (a > 0)
    {
        digit = a % 10;
        sum += digit * pow(2, i);
        a /= 10;
        i++;
    }
    printf("%d", sum);
}