#include<stdio.h>
int main()
{
    int arr[]={2,3,4,5};int max=0,temp=0;
    max=arr[0];
    int arrlen= sizeof(arr)/sizeof(arr[0]);
    for(int i=0;i<arrlen;i++){
            if(arr[i]>max)
            max=arr[i];
            }
printf("\nThe maximum is : %d",max);
}