#include <stdio.h>
void main()
{printf("Enter a character in lower case: ");
char c;scanf("%c",&c);
char u=(char)((int)c-32);
printf("\nThe uppercase is: %c",u);
}