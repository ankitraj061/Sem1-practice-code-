#include<stdio.h>
void main(){
    int a[5]={1,2,3,4,5};
    int c;
    printf("enter a number");
    scanf("%d",&c);


    for(int i=0;i<5;i++){
        if(c==a[i]){
            printf("yes");
            break;
        }
        
    }
}