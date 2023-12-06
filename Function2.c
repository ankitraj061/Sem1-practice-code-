//WAP 
#include<stdio.h>
int max(int,int,int,int);
int min(int,int,int,int);
int max(int a,int b, int c, int d){
    
    int g=a;
    if(g<=b){
        g==b;
    }
    else if (g<=c){
        g==c;
    }
    else if(g<=d){
        g==d;
    }
    else{
        g==a;
    }
    return g;

}   
int min(int a, int b,int c,int d){
   
    
    int g=a;
    if(g>=b){
        g==b;
    }
    else if (g>=c){
        g==c;
    }
    else if(g>=d){
        g==d;
    }
    else{
        g==a;
    }
    return g;

}   
void main(){
     int num1,num2,num3,num4;
    printf("Enter four numbers:");
    scanf("%d %d %d %d",&num1,&num2,&num3,&num4);
    int maxValue=max(num1,num2,num3,num4);
    int minValue=min(num1,num2,num3,num4);
    printf("%d\n",maxValue);
    printf("%d",minValue);
    

    


}
//WAP which provides maximum and min value among four integer variables scaned using funtion