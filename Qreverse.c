#include<stdio.h>
void main(){
    int n;
    printf("Enter a number :");
    scanf("%d",&n);
    int temp=n;
    int rev;
    int sum=0;
    while(n>0){
        rev=n%10;
        sum=sum*10+rev;
        n=n/10;
    }
    int result;
    if(temp>sum){
        result=temp-sum;

    }else{
        result=sum-temp;
    }
    int digit;
    int magicNum=0;
    while(result>0){
        digit = result%10;
        magicNum=magicNum+digit;
        result=result/10;



    }
    printf("Magic number is : %d",magicNum);
}


//we use typedef to change the scope of datatype within similar file (.c)