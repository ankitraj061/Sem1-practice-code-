
    import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of N");
        int N=sc.nextInt();
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(i==0 || i==N-1 || j==0 || j==N-1 ||i+j<=(N-1)/2 ||(j-i)>=(N-1)/2 ||(i+j)>=(N-1)+(N-1)/2||(i-j)>=(N-1)/2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

