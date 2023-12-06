import java.util.Scanner;

public class SecondGreatest {
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter four number :");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        int g=a;
        if(g<b){
            g=b;
        }
        
        if(g<c){
            g=c;
        }
        if(g<d){
            g=d;
        }
        
        if(g==a){
            int h=b;
            if (h<c) {
                h=c;
                
            }
            if(h<d){
                h=d;
            }
            System.out.println("Second greatest number is "+h);


        }
        if(g==b){
            int h=a;
            if (h<c) {
                h=c;
                
            }
            if(h<d){
                h=d;
            }
            System.out.println("Second greatest number is "+h);


        }
        if(g==c){
            int h=a;
            if (h<b) {
                h=b;
                
            }
            if(h<d){
                h=d;
            }
            System.out.println("Second greatest number is "+h);


        }
        if(g==d){
            int h=a;
            if (h<b) {
                h=b;
                
            }
            if(h<c){
                h=d;
            }
            System.out.println("Second greatest number is "+h);


        }


    }
}
