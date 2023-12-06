#include<stdio.h>
int main(){
    int n,i,totalPrice;
    void again(){
        printf("Items and Price \nItem1 RS-100 \nItem2 RS-200 \nItem3 RS-300 \nItem4 RS-350 \nItem5 RS-400 \nItem6 RS-450 \nPlease enter the choice as item number");
    scanf("%d",&n);
    printf("Please enter the number of plates you want!");
    scanf("%d",&i);

    }
    printf("Items and Price \nItem1 RS-100 \nItem2 RS-200 \nItem3 RS-300 \nItem4 RS-350 \nItem5 RS-400 \nItem6 RS-450 \nPlease enter the choice as item number");
    scanf("%d",&n);
    printf("Please enter the number of plates you want!");
    scanf("%d",&i);
    totalPrice=n*i;
    if(totalPrice<=2000){
        printf("your order is confermed!");

    }
    else{
        printf("You can't order because you crossed your limit!");
        again();
    }
    

}