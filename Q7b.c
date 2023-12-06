#include<stdio.h>
int main(){
    int n;
    int sum=0;
    printf("Enter nth term value :");
    scanf("%d",&n);
    for(int i=11; i<= n; i+=10){

        sum=sum+i;
    }
    
    printf("The sum of all %d terms = %d",n,sum);
    return 0;
}