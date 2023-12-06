#include<stdio.h>
void main(){
    int counter;
    while(1){
        scanf("%d",&counter);
        if(counter<0){
            printf("I'm not positive");
            continue;

        }
        
        else
        printf("I'm positive");
    printf("\n");
        
    }
}