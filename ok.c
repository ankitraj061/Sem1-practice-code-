#include <stdio.h>
int main()
{
    int num = 10;
    int fun(int num);
    printf("%d", fun(num));
}
int fun(int num)
{
    if (num > 0)
        return (num + fun(num - 2));
}
