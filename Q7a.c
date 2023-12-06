#include<stdio.h>
int main(){
    int n;
    int sum=0;
    printf("Enter nth term value :");
    scanf("%d",&n);
    for(int i=2; i<= n; i+=2){

        sum=sum+i;
    }
    
    printf("The sum of first even %d terms = %d",n,sum);
    return 0;
}