#include<stdio.h>
int main(){
    int n;
    int bool1,bool2,bool3;

    printf("Enter your choice number to select gate out of :-\n1)AND \n2)OR \n3)NOT \n4)NOR and \n5)NAND :\n");
    scanf("%d",&n);
    if(n==1 || n==2 || n==4||n==5){
        printf("Enter two Boolean Value:");
        scanf("%d %d",&bool1,&bool2);
    }
    else if(n==3){
    printf("Enter one Boolean value to perform NOT operation:");
    scanf("%d",&bool3);

    }
    else
    printf("You have entered worng input:");
    if((bool1==1 ||bool1==0) &&(bool2==1 ||bool2==0) &&(bool3==1 || bool3==0) ){
        switch(n){
        case 1:
            printf("The AND operation of %d && %d = %d",bool1,bool2,bool1 && bool2);
            break;
        case 2:
        printf("The OR operation of %d && %d = %d",bool1,bool2,bool1 || bool2);
            break;
        case 3:
            printf("The NOT operation of %d = %d",!bool3);
            break;

        case 4:
        printf("The NOR operation of %d && %d = %d",bool1,bool2,!(bool1 || bool2));
        break;
        case 5:
        printf("The NAND operation of %d && %d = %d",bool1,bool2,!(bool1 && bool2));
        break;
        
    }
    

    }
    else
    printf("You have entered wrong value:");
    
    
    return 0;
}