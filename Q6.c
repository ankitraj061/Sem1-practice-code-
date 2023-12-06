#include<stdio.h>
int main(){
    int n;
    printf("Choose the ticket price \n1)20000 \n2)10000 \n3)5000 \n4)2000");
    scanf("\n%d",&n);
    if(n==1){
        printf("you had got VVIP ticket");
    }
    else if(n==2){

        printf("you had got VIP ticket");
    }
    else if(n==3){

        printf("you had got special county ticket");
    }
    else if(n==4){

        printf("you had got genral county ticket");
    }
    else{
        printf("Wrong input!");
    }
    

}