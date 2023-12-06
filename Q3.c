#include<stdio.h>
int main(){
    int num1;
    printf("Enter a value:");
    scanf("%d",&num1);
    if(num1%3==0 && num1%5==0){
        printf("The number %d is divisible by both 3 and 5!",num1);

    }
    else if(num1%3==0)
        printf("The number %d is divisible by  3 only!",num1);
    else if(num1%5==0)
        printf("The number %d is divisible by  5 only!",num1);
    else
        printf("The number %d is not divisible by both 3 and 5!",num1);
    
    return 0;
}