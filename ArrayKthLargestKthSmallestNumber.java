import java.util.Scanner;

public class ArrayKthLargestKthSmallestNumber {
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
        int temp=0;

        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                if(array[i]<array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                
                }
            }
        }
        System.out.println("Enter Kth Number to see Kth largest and Kth smallest number");
        int k=sc.nextInt();
        
            if(k<=N){
                System.out.println(array[k-1]+" is the"+k+"th largest and "+array[N-k]+" is the"+k+"th smallest number!");
            }
    }
}
