#include<stdio.h>
int main(){
    char c;
    while((c=getchar())!=EOF)
    putchar(c);
    return 0;
}

//getchar() is used to read charecter
//putchar() is used to write charecter 

//EOF (End of the File)indicates the end of input.
//after we enter the text , if we press CTRL+Z the text terminates i.e. it indicates the file reached end nothing to read.
