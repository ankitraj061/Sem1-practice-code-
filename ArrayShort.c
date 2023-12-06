#include<stdio.h>
void main(){
    int a[5]={1,2,8,3,0};
    int temp;
    for(int i=0;i<5;i++){
        for(int j=i+1;j<5;j++){
            if(a[i]<a[j]){
                temp=a[j];
                a[j]=a[i];
                a[i]=temp;
            }
        }

    }
    for(int i=0;i<5;i++){
        printf("%d ",a[i]);
    }
}