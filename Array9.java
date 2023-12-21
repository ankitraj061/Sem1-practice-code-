class SecArray {
    void display(int a[]) {
        for (int n : a) {
            System.out.println(n);

        }
    }
}
public class Array9 {
    public static void main(String[] args) {

        SecArray sa=new SecArray();
        String s="  ";
        int arr[]={2,4,5,6};
        sa.display(arr);
        
    }
    
}
