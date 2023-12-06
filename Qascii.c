#include<stdio.h>
void main(){
    char c;
    printf("Enter a charecter:");
    scanf("%c",&c);
    if(c==65){
    printf("Entered charecter is A");
        
    }else{
    printf("Entered charecter is not A");

    }
    int i=1;
    switch(i){
        case 1:
        printf("first case");break;
        case 1:
        printf("second case");break;
    }
}