#include<stdio.h>
void main(){
    char lCase;char uCase;
    int ascii;
    //printf("Hi");
    printf("Enter a lowercase charecter:");
    scanf("%c",&lCase);
    ascii=lCase;
    uCase=ascii-32;
    printf("The uppercase :%c",uCase);
        
}