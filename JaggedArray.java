public class JaggedArray {
    public static void main(String[] args) {
        int nums[][]={
                       {1,2,3,4},
                       {2,3},
                       {1,3,5},
                       {1}
                    };
    
    for(int a =0;a<=3;a++){
        
        for(int b=0;b<nums[a].length;b++){
            System.out.print(nums[a][b]+" ");

        }
        System.out.println();
    }
}
}
