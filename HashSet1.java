import java.util.HashSet;

public class HashSet1{
    public static void main(String[] args) {
        HashSet hs=new HashSet();

        hs.add(6);
        hs.add(1);
        hs.add(2);
        hs.add(1);
        System.out.println(hs);

        if(hs.contains(6)){
            System.out.println("Yes contains 6");
        }

        hs.remove(1);
        if(!hs.contains(1)){
            System.out.println("No ");
            System.out.println();
           

        }
         System.out.println(hs);
    }
}