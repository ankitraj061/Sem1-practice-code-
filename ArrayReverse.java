import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int N=sc.nextInt();
        int array[]=new int[N];
        int array1[]=new int[N];
        for(int i=0;i<N;i++){

            System.out.print("Enter the "+i+"th index value:");
            array[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++){
            array1[i]=array[N-1-i];
            //array1[i]=array[i];
            


            
        }
        for(int n:array1){
            System.out.print(n+ " ");
        }
        
    }
}
