//arrange array elements in desending order
public class ArraySort {

    public static void main(String[] args) {
        int arr1[]={2,4,1,3,7,1,1,5};
        int temp=0;

        for(int i=0;i<arr1.length;i++){
            for(int j=i+1;j<arr1.length;j++){
                if(arr1[i]>arr1[j]){
                    temp=arr1[j];
                    arr1[j]=arr1[i];
                    arr1[i]=temp;
                    
                }
                
                // else
                // {
                //     temp=arr1[j+1];
                // }
                

                // arr1[i]=temp;
            }
            
        }
        for(int n:arr1){
            System.out.println(n);
        }
        
    }
}