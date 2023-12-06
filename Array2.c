#include<stdio.h>
void main(){
    int a[5]={1,2,3,4,5};
    int temp=a[4];
    int c;
    for(int i=4;i-1>=0;i--){
        
        a[i]=a[i-1];
    }
    a[0]=temp;
    for(int i=0;i<5;i++){
        printf("%d",a[i]);
    }
}