

class InnerAnonymousArray {
    public int add(int nums[] ){
        int result=0;
        for (int n  : nums) {
            result=result+n;
            
        }
        return result;
    }

    
}
public class AnonymousArray {

    public static void main(String[] args) {
        InnerAnonymousArray sc = new InnerAnonymousArray();

        int sum=sc.add(new int[]{2,3,4,5});//Here we used an Anonymous Array which is only used once in a program.
        System.out.println(sum);
        
    }
}
