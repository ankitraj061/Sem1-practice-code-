#include<stdio.h>
void main(){
    int n;
    printf("Enter the size of Array:");
    scanf("%d",&n);
    int a[n];
    printf("\nEnter elements of Array:");
    printf("\n");
    for(int i=0;i<n;i++ ){
        scanf("%d\n",&a[i]);
    }
    int l;
    printf("\nEnter an element of Array:");
    scanf("%d",&l);
    int count=0;

    for(int i=0;i<n;i++){
        if(a[i]==l){
            count++;

        }

    }
    printf("The %d comes %d times.",l,count);



}