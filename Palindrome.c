#include<stdio.h>
int main(){
    int n,rev=0;
    printf("Enter a number");
    scanf("%d",&n);
    int g=n;
    while(n>0){
        int r=n%10;
         rev=rev*10+r;
         n=n/10;
    }
    if(rev==g){
        printf("yes");
        printf("%d",rev);
        
    }
    else{
         printf("No");
         printf("%d",rev);
    }
    
    
}