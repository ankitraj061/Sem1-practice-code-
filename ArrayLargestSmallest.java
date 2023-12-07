import java.util.Scanner;

public class ArrayLargestSmallest {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n=sc.nextInt();
        
        int []arr1=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter "+(i+1)+"th value:" );
            arr1[i]=sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr1[i]<arr1[j]){
                    temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
            

            }
        }
        System.out.println("The largest value is "+arr1[0]+", and the smallest value is "+arr1[n-1]);
    }
}

//find largest and smallest value of array
