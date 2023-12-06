import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns of First matrix:");
        int row1=sc.nextInt();
        int col1=sc.nextInt();
        System.out.println("Enter the rows and columns of Second matrix:");
        int row2=sc.nextInt();
        int col2=sc.nextInt();
        int arr1[][]=new int[row1][col1];
        int arr2[][]=new int[row2][col2];
        int arr3[][]=new int[row1][col2];
        //System.out.println("enter the elements of First matrix:");
        if(row1==row2 && col1==col2){
            for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                System.out.print("Enter element for First Matrix at position (" + (i + 1) + ", " + (j + 1) + "): ");
                arr1[i][j]=sc.nextInt();
            }
        }
        //System.out.println("enter the elements of Second matrix:");
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                System.out.print("Enter element for Second Matrix at position (" + (i + 1) + ", " + (j + 1) + "): ");
                arr2[i][j]=sc.nextInt();
            }
        }
            for(int i=0;i<row1;i++){
                for(int j=0;j<col1;j++){
                    arr3[i][j]=arr1[i][j]+arr2[i][j];

                }
            }
            for(int i=0;i<arr3.length;i++){
                for(int j=0;j<arr3[i].length;j++){
                    System.out.print(arr3[i][j]+ " ");
                }
                System.out.println();
            }

            
        }
        else{
            System.out.println("Can't be added");
        }
        
        

        
        
    }
}
