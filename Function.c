//WAP 
#include<stdio.h>
void main(){
    int sum=0,n;
    printf("enter last term value:");
    scanf("%d",&n);
    if(n<=100){
        for(int i=11;i<=n;i+=11){
    sum=sum+i;
    }
        printf("%d",sum);

    }
    else{
        printf("Wrong input:");
    }
    
}