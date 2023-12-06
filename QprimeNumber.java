import java.util.Scanner;

public class hello{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=2;i/2<n;i++){
            if(n%i==0){
                System.out.println(+n+ " is not prime:");
                break;
            }
            else{
                System.out.println(+n+ " is prime");
                break;
                

            }
            
        }
    }
}