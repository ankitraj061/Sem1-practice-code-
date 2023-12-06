#include<stdio.h>
int sumfunction(int a){
    if(a==1)
    return 0;
    else
    return a+sumfunction(a-1);
}
void main(){
    int n;
    printf("Enter a last term:");
    scanf("%d",&n);
    int sum=sumfunction(n);
    printf("the sum of %d numbers is %d",n,sum);
}