#include<stdio.h>
int main(){
    int score;
    printf("Enter the score out of 100:");
    scanf("%d",&score);
    if(score>=90 && score<=100){
        printf("The grade is A+");
    }
    else if(score>=80 && score<=89){
        printf("The grade is A");
    }
    else if(score>=70 && score<=79){
        printf("The grade is B+");
    }
    else if(score>=60 && score<=69){
        printf("The grade is B");
    }
    else if(score>=50 && score<=59){
        printf("The grade is A+");
    }
    else if(score>=40 && score<=49){
        printf("The grade is A+");
    }
    else{
        printf("The sudent not qualified for the contest!");
    }
}