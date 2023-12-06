public class JaggedArray2 {
    public static void main(String[] args) {
        int nums[][]= new int[4][];
        nums[0]= new int[4];//size of first row is 4
        nums[1]= new int[2];//size of second row is 2
        nums[2]= new int[3];//size of third row is 3
        nums[3]= new int[1];//size of fourth row is 1


        nums[0][0]=1;
        nums[0][1]=2;
        nums[0][2]=3;
        nums[0][3]=4;
        nums[1][0]=2;
        nums[1][1]=3;
        nums[2][0]=1;
        nums[2][1]=3;
        nums[2][2]=5;
        nums[3][0]=1;
      
        //Enhanced for loop
        for(int a[]:nums ){
            for(int n:a){
                System.out.print(n+" ");
            }
            System.out.println();
        }
        
    }
}
