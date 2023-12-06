class Array1{
    public static void main(A5[] args) {
        int num[] = {2,3,4,5};
        for(int n:num){ //this for loop is called enhanced for loop
            System.out.println(n);
        }

        
         System.out.println();
         System.out.println();

         int nums[][]= {{2,3,4,5},{2,4,6,8},{1,3,5,7}};
         for(int a[]: nums){
            for(int b: a){
                System.out.print(b);
            }
            System.out.println();
         }
    }
}