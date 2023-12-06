#include<stdio.h>
int maxNum(int a,int b){
    if(a>b)
    return a;
    else
    return b;
}
int minNum(int a,int b){
    if(a>b)
    return b;
    else
    return a;
}
void main(){
    int x,y,z;
    printf("Enter three numbers: ");
    scanf("%d %d %d",&x,&y,&z);
    int max=maxNum(x,maxNum(y,z));
    int min=minNum(x,minNum(y,z));
    printf("The largest is %d",max);
    printf("The Smallest is %d",min);
}