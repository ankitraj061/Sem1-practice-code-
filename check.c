#include<stdio.h>
void test(int);
#define a 3;
#define x(a) (a*a);

void main(){
   
    void test(int x){
        x = x+1;
        printf("%d",x(a)/(a+2));
    }
     void test(x(a));
    
}